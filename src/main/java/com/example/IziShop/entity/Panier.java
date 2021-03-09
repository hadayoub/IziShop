package com.example.IziShop.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Panier")
public class Panier {
	@Id
	private Long Id;
	@ManyToOne
	@JoinColumn(name = "ID",referencedColumnName = "Id", insertable = false, updatable = false)
	private Produit produit;

	@ManyToOne
	@JoinColumn(name = "ID",referencedColumnName = "Id", insertable = false, updatable = false)
	private User User;

	
	private Long Qte;


	public Panier(Long id, Produit produit, com.example.IziShop.entity.User user, Long qte) {
		Id = id;
		this.produit = produit;
		User = user;
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


	public Produit getProduit() {
		return produit;
	}


	public void setProduit(Produit produit) {
		this.produit = produit;
	}


	public User getUser() {
		return User;
	}


	public void setUser(User user) {
		User = user;
	}


	public Long getQte() {
		return Qte;
	}


	public void setQte(Long qte) {
		Qte = qte;
	}

	
	
	
}
