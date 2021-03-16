package com.example.IziShop.service;

import java.util.List;

import com.example.IziShop.entity.Panier;



public interface IPanierService {
	List<Panier> getAll();

	void addToPanier(Panier panier);


	void deleteFromPanier(Long Id);

	void viderPanier(Panier panier);
}
