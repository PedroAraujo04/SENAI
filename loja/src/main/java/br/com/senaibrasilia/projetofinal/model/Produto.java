package br.com.senaibrasilia.projetofinal.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String nome,descriçao;
	private BigDecimal preço;
	
	@ManyToOne
	private Categoria categoria;
	public Produto() {
	}
	public Produto(String nome, String descriçao, BigDecimal preço, Categoria categoria) {
		this.nome = nome;
		this.descriçao = descriçao;
		this.preço = preço;
		this.categoria= categoria;
	
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescriçao() {
		return descriçao;
	}
	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}
	public BigDecimal getPreço() {
		return preço;
	}
	public void setPreço(BigDecimal preço) {
		this.preço = preço;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}	
}