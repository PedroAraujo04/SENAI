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
	private String nome,descri�ao;
	private BigDecimal pre�o;
	
	@ManyToOne
	private Categoria categoria;
	public Produto() {
	}
	public Produto(String nome, String descri�ao, BigDecimal pre�o, Categoria categoria) {
		this.nome = nome;
		this.descri�ao = descri�ao;
		this.pre�o = pre�o;
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
	public String getDescri�ao() {
		return descri�ao;
	}
	public void setDescri�ao(String descri�ao) {
		this.descri�ao = descri�ao;
	}
	public BigDecimal getPre�o() {
		return pre�o;
	}
	public void setPre�o(BigDecimal pre�o) {
		this.pre�o = pre�o;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}	
}