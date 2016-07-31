package br.com.loja.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	private static String jdbcDriver = null;
	private static String jdbcUrl = null;
	private static String user = null;
	private static String password = null;

	private static Connection conexao = null;

	public static Connection get() {
		if (conexao != null) {
			return conexao;
		}
		if(jdbcUrl==null || jdbcDriver==null||user==null||password==null){
			setDataBaseConfig();
		}
		try{
			Class.forName(jdbcDriver);
			conexao = DriverManager.getConnection(jdbcUrl,user,password);
		}catch(Exception ex){
			ex.printStackTrace();
			System.exit(-1);
		}
		return conexao;
	}

	private static void setDataBaseConfig() {
		jdbcUrl = "jdbc:oracle:thin:@localhost:1521:local";
		jdbcDriver = "oracle.jdbc.OracleDriver";
		user = "root";
		password = "senha";
	}
}
