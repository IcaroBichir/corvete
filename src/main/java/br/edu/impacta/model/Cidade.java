package br.edu.impacta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cidade {

	@Id
	@GeneratedValue
	private int Id_Cidade;
	
	@ManyToOne
	@JoinColumn(name = "Id_Estado")
	private int Id_Estado;
	private String Nome;
	
	public int getId_Cidade() {
		return Id_Cidade;
	}
	public void setId_Cidade(int id_Cidade) {
		Id_Cidade = id_Cidade;
	}
	public int getId_Estado() {
		return Id_Estado;
	}
	public void setId_Estado(int id_Estado) {
		Id_Estado = id_Estado;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
}
