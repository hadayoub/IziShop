package com.example.IziShop.service;

import java.util.List;

import com.example.IziShop.entity.Panier;
import com.example.IziShop.entity.Produit;
import com.example.IziShop.entity.User;


public interface IPanierService {
	List<Panier> getAll();

	void addToPanier(Panier panier);
}
