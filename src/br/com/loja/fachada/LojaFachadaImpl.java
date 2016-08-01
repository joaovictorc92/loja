package br.com.loja.fachada;

import java.sql.SQLException;
import java.util.Collection;

import br.com.loja.apresentacao.IEmpresa;
import br.com.loja.dao.EmpresaDao;
import br.com.loja.dao.EmpresaDaoImpl;

public class LojaFachadaImpl {
	EmpresaDao empresaDao;
	public LojaFachadaImpl(){
		empresaDao = new EmpresaDaoImpl(); 
	}
	
	public Collection<IEmpresa> carregarEmpresas() throws SQLException{
		return empresaDao.carregaEmpresas();
	}
}
