package br.edu.impacta.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;


public class ConnectionUtil {
	
private Connection conexao = null;
	
	public Connection getConection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			this.conexao =  DriverManager.getConnection("jdbc:mysql://localhost:1433/corvette", "root", "download");
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
