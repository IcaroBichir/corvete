package br.edu.impacta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Passagem {
	
	@Id
	@GeneratedValue
	private int Id_Passagem;
	
	@ManyToOne
	@JoinColumn(name = "Id_Usuario")
	private int Id_Usuario;
	private double Valor;
	
	public int getId_Passagem() {
		return Id_Passagem;
	}
	public void setId_Passagem(int id_Passagem) {
		Id_Passagem = id_Passagem;
	}
	public int getId_Usuario() {
		return Id_Usuario;
	}
	public void setId_Usuario(int id_Usuario) {
		Id_Usuario = id_Usuario;
	}
	public double getValor() {
		return Valor;
	}
	public void setValor(double valor) {
		Valor = valor;
	}
}
