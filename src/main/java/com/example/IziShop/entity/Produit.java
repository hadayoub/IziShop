package com.example.IziShop.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "Produit")
public class Produit {
	@Id
	private Long Id;
	private String nomP;
	private String prix;
	private String categorie;
	private String image;
	private String taille;
	private String couleurs;
	private String description_courte;
	private String description_long;
	private Long qte_stock;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNomP() {
		return nomP;
	}
	public void setNomP(String nomP) {
		this.nomP = nomP;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getTaille() {
		return taille;
	}
	public void setTaille(String taille) {
		this.taille = taille;
	}
	public String getCouleurs() {
		return couleurs;
	}
	public void setCouleurs(String couleurs) {
		this.couleurs = couleurs;
	}
	public Produit() {
	}

	public Produit(Long id, String nomP, String prix, String categorie, String image, String taille, String couleurs,
			String description_courte, String description_long, Long qte_stock) {
		Id = id;
		this.nomP = nomP;
		this.prix = prix;
		this.categorie = categorie;
		this.image = image;
		this.taille = taille;
		this.couleurs = couleurs;
		this.description_courte = description_courte;
		this.description_long = description_long;
		this.qte_stock =qte_stock;
	}
	public void setQte_stock(Long qte_stock) {
		this.qte_stock = qte_stock;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription_courte() {
		return description_courte;
	}
	public void setDescription_courte(String description_courte) {
		this.description_courte = description_courte;
	}
	public String getDescription_long() {
		return description_long;
	}
	public void setDescription_long(String description_long) {
		this.description_long = description_long;
	}
	public Long getQte_stock() {
		return qte_stock;
	}
	
	
}
