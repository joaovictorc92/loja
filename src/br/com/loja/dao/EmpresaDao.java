package br.com.loja.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import br.com.loja.apresentacao.IEmpresa;
import br.com.loja.apresentacao.form.EmpresaForm;
import br.com.loja.conexao.Conexao;

public interface EmpresaDao {

	Collection<IEmpresa> carregaEmpresas() throws SQLException;

}
