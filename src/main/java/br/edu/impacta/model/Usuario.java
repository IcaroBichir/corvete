package br.edu.impacta.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue
	private int Id_Usuario;
	private String Nome;
	private String Data_Nascimento;
	private long Telefone;
	private long CPF_CNPJ;
	private String Email;
	private String Senha;
	
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	public int getId_Usuario() {
		return Id_Usuario;
	}
	public void setId_Usuario(int id_Usuario) {
		Id_Usuario = id_Usuario;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getData_Nascimento() {
		return Data_Nascimento;
	}
	public void setData_Nascimento(String data_Nascimento) {
		Data_Nascimento = data_Nascimento;
	}
	public long getTelefone() {
		return Telefone;
	}
	public void setTelefone(long telefone) {
		Telefone = telefone;
	}
	public long getCPF_CNPJ() {
		return CPF_CNPJ;
	}
	public void setCPF_CNPJ(long cPF_CNPJ) {
		CPF_CNPJ = cPF_CNPJ;
	}
	
}
