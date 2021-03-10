package com.example.IziShop.service;

import java.util.List;

import com.example.IziShop.entity.Produit;

public interface IProduitService {
	List<Produit> getAll();

	void addProduit(Produit produit);

	void deleteProduit(Long Id);

	void updateProduit(Produit produit);

	

}
