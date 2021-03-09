package com.example.IziShop.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long Id;
	private String nomU;
	private String prenom;
	private String mail;
	private String ville;
	private String adresse;
	private String telephone;
	
	
	public User() {

	}

	public User(Long id, String nomU, String prenom, String mail, String ville, String telephone) {
		Id = id;
		this.nomU = nomU;
		this.prenom = prenom;
		this.mail = mail;
		this.ville = ville;
		this.telephone = telephone;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNomU() {
		return nomU;
	}

	public void setNomU(String nomU) {
		this.nomU = nomU;
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
