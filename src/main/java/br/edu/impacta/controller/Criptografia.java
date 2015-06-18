package br.edu.impacta.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Criptografia {
	
	private static String hexCodes(byte[] text) throws Exception{
		try {
			char[] hexOutput = new char[text.length * 2];
			String hexString; 
			
			for (int i = 0; i < text.length; i++) 
			{ 
				hexString = "00" + Integer.toHexString(text[i]);
				hexString.toUpperCase().getChars(hexString.length() - 2, hexString.length(), hexOutput, i * 2);
			} 
			MessageDigest md;
		
			md = MessageDigest.getInstance("MD5");
			return new String(hexCodes(md.digest(text)));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			try {
				throw new Exception("Erro ao criptografar os dados. Erro: " + e.getMessage());
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println(e.getMessage());
				throw new Exception("Erro ao criptografar os dados. Erro: " + e.getMessage());
				
			}
		}
		
	}
	
	public String SetCriptografiaString(String text) throws Exception
	{
		try	{
			//Crptografa 
			return hexCodes(text.getBytes());
		}catch(Exception e){
			throw new Exception("Erro ao criptografar os dados. Erro: " + e.getMessage());
		}
	}
}
