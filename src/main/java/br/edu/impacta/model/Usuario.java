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
	private Date Data_Nascimento;
	private int Telefone;
	private int CPF_CNPJ;
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
	public Date getData_Nascimento() {
		return Data_Nascimento;
	}
	public void setData_Nascimento(Date data_Nascimento) {
		Data_Nascimento = data_Nascimento;
	}
	public int getTelefone() {
		return Telefone;
	}
	public void setTelefone(int telefone) {
		Telefone = telefone;
	}
	public int getCPF_CNPJ() {
		return CPF_CNPJ;
	}
	public void setCPF_CNPJ(int cPF_CNPJ) {
		CPF_CNPJ = cPF_CNPJ;
	}
	
}
