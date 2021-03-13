package com.example.IziShop.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.IziShop.entity.Produit;

public interface IProduitService {
	List<Produit> getAll();

	void addProduit(Produit produit);

	void deleteProduit(Long Id);

	ResponseEntity<Object> UpdateProduit(Produit produit, long Id);

	

}
