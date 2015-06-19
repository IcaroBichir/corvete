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
	public int Id_Voo;
	
	@ManyToOne
	@JoinColumn(name = "Id_Cidade")
	public int Id_Cidade;
	public Date Data_Saida;
	public Date Data_Chegada;
	
	
	public int getId_Voo() {
		return Id_Voo;
	}
	public void setId_Voo(int id_Voo) {
		Id_Voo = id_Voo;
	}
	public int getId_Cidade() {
		return Id_Cidade;
	}
	public void setId_Cidade(int id_Cidade) {
		Id_Cidade = id_Cidade;
	}
	public Date getData_Saida() {
		return Data_Saida;
	}
	public void setData_Saida(Date data_Saida) {
		Data_Saida = data_Saida;
	}
	public Date getData_Chegada() {
		return Data_Chegada;
	}
	public void setData_Chegada(Date data_Chegada) {
		Data_Chegada = data_Chegada;
	}
}
