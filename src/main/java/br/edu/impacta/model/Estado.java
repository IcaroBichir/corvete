package br.edu.impacta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Estado {
		
	@Id
	@GeneratedValue
	private int Id_Estado;
	
	@ManyToOne
	@JoinColumn(name = "Id_Pais")
	private int Id_Pais;
	
	private String Nome;

	public int getId_Estado() {
		return Id_Estado;
	}

	public void setId_Estado(int id_Estado) {
		Id_Estado = id_Estado;
	}

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
