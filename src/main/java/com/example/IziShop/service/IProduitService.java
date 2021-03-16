package com.example.IziShop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.example.IziShop.entity.Produit;

public interface IProduitService {
	
	Optional<Produit> get(Long id);
	
	
	List<Produit> getAll();

	void addProduit(Produit produit);

	void deleteProduit(Long Id);

	ResponseEntity<Object> UpdateProduit(Produit produit, long Id);

	void increment(Long Id, Long qte);

	void decrement(Long Id, Long qte);


	


}
