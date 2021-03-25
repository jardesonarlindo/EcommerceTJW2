package br.edu.ifce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Products {
	@Id
	@GeneratedValue
	private Long idP;
	private String NomeProduto;
	private String Preco;
	
	public String getNomeProduto() {
		return NomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		NomeProduto = nomeProduto;
	}
	public String getPreco() {
		return Preco;
	}
	public void setPreco(String preco) {
		Preco = preco;
	}
	



}
