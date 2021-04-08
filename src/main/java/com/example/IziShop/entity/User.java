package com.example.IziShop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long Id;
	private String username;
	private String nom;
	private String prenom;
	private String mail;
	private String ville;
	private String adresse;
	private String telephone;
	private String password;
	private Boolean active;
	
	
	
	public User() {
	}

	public User(Long id, String username, String nom, String prenom, String mail, String ville, String adresse,
			String telephone, String password, Boolean active) {
		Id = id;
		this.username = username;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.ville = ville;
		this.adresse = adresse;
		this.telephone = telephone;
		this.password = password;
		this.active = active;
		
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
}