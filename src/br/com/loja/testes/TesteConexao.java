package br.com.loja.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.loja.conexao.Conexao;

public class TesteConexao {
	
	@Test
	public void testConexao() {
		assertNotNull(Conexao.get()); 
	}

}
