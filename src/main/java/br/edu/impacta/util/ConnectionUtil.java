package br.edu.impacta.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class ConnectionUtil {
	
	private static ResourceBundle config;
	
	private static ConnectionUtil conexaoUtil;
	
	private ConnectionUtil(){
		config = ResourceBundle.getBundle("config");
	}
	
	public static ConnectionUtil getInstance(){
		if(conexaoUtil == null){
			conexaoUtil = new ConnectionUtil();
		}
		return conexaoUtil;
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName(config.getString("br.edu.impacta.driver.mysql"));
		return DriverManager.getConnection(config.getString("br.edu.impacta.url.conexao"), 
							config.getString("br.edu.impacta.usuario"), config.getString("br.edu.impacta.senha"));
	}
}
