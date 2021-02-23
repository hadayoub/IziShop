package com.example.IziShop.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Panier")
public class Panier {
	@Id
	private Long Id;
	private Long user_id;
	private Long produit_id;
	private Long Qte;
	public Panier(Long id, Long user_id, Long produit_id, Long qte) {
		super();
		Id = id;
		this.user_id = user_id;
		this.produit_id = produit_id;
		Qte = qte;
	}
	public Panier() {
		
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public Long getProduit_id() {
		return produit_id;
	}
	public void setProduit_id(Long produit_id) {
		this.produit_id = produit_id;
	}
	public Long getQte() {
		return Qte;
	}
	public void setQte(Long qte) {
		Qte = qte;
	}
	
}
