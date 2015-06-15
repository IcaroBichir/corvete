package br.edu.impacta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pais {
	
	@Id
	@GeneratedValue
	private int Id_Pais;
	private String Nome;
	
	public int getId_Pais() {
		return Id_Pais;
	}
	public void setId_Pais(int id_Pais) {
		Id_Pais = id_Pais;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
}
