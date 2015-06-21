package br.edu.impacta.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Voo {
	
	@Id
	@GeneratedValue
	private int Id_Voo;
	
	@ManyToOne
	@JoinColumn(name = "Id_Cidade")
	private int Id_Cidade_Origem;
	
	@ManyToOne
	@JoinColumn(name = "Id_Cidade")
	private int Id_Cidade_Destino;
	private String Data_Saida;
	private String Data_Chegada;
	
	
	public int getId_Voo() {
		return Id_Voo;
	}
	public void setId_Voo(int id_Voo) {
		Id_Voo = id_Voo;
	}
	public int getId_Cidade_Origem() {
		return Id_Cidade_Origem;
	}
	public void setId_Cidade_Origem(int id_Cidade_Origem) {
		Id_Cidade_Origem = id_Cidade_Origem;
	}
	public int getId_Cidade_Destino() {
		return Id_Cidade_Destino;
	}
	public void setId_Cidade_Destino(int id_Cidade_Destino) {
		Id_Cidade_Destino = id_Cidade_Destino;
	}
	public String getData_Saida() {
		return Data_Saida;
	}
	public void setData_Saida(String data_Saida) {
		Data_Saida = data_Saida;
	}
	public String getData_Chegada() {
		return Data_Chegada;
	}
	public void setData_Chegada(String data_Chegada) {
		Data_Chegada = data_Chegada;
	}
}
