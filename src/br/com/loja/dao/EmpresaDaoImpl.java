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
	public Collection<IEmpresa> carregaEmpresas() throws SQLException{
		Collection<IEmpresa> retorno = new ArrayList<IEmpresa>();
		PreparedStatement statement = Conexao.get().prepareStatement("select * from empresa");
		ResultSet rs = statement.executeQuery();
		while(rs.next()){
			IEmpresa empresa = new EmpresaForm();
			String codigo = rs.getString("idempresa");
		}
		return retorno;
	}
}
