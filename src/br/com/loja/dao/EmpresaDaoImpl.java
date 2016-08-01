package br.com.loja.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import br.com.loja.apresentacao.IEmpresa;
import br.com.loja.apresentacao.form.EmpresaForm;
import br.com.loja.conexao.Conexao;

public class EmpresaDaoImpl implements EmpresaDao{
	
	@Override
	public Collection<IEmpresa> carregaEmpresas() throws SQLException{
		Collection<IEmpresa> retorno = new ArrayList<IEmpresa>();
		PreparedStatement statement = Conexao.get().prepareStatement("select * from empresa");
		ResultSet rs = statement.executeQuery();
		while(rs.next()){
			IEmpresa empresa = new EmpresaForm();
			String codigo = rs.getString("idempresa");
			String nome = rs.getString("nome");
			String cpfCnpj = rs.getString("cnpj");
			String endereco = rs.getString("endereco");
			String tipo = rs.getString("tipo");
			empresa.setNome(nome);
			empresa.setCpfCnpj(cpfCnpj);
			empresa.setEndereco(endereco);
			empresa.setTipo(tipo);
			retorno.add(empresa);
		}
		return retorno;
	}
}
