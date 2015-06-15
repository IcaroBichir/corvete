package br.edu.impacta.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;


public class ConnectionUtil {
	
	private static ResourceBundle config;
	private static Connection conexao = null;
	private static ConnectionUtil conn = null;
	
	private ConnectionUtil(){
		config = ResourceBundle.getBundle("config");
	}	
	
	public static ConnectionUtil getInstance(){
		if(conn == null){
			conn = new ConnectionUtil();
		}
		return conn;
	}
	
	public Connection getConection()
	{
		try
		{
			Class.forName(config.getString("br.edu.impacta.driver.mysql"));
			this.conexao =  DriverManager.getConnection(config.getString("br.edu.impacta.url.conexao"),
					config.getString("br.edu.impacta.usuario"), config.getString("br.edu.impacta.senha"));
			System.out.println("Conectado");
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return conexao;
	}
}
