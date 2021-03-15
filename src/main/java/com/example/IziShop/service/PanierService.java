package com.example.IziShop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.IziShop.entity.Entity;
import com.example.IziShop.entity.Panier;
import com.example.IziShop.entity.Produit;
import com.example.IziShop.entity.User;
import com.example.IziShop.reposetory.IPanierRepository;
import com.example.IziShop.reposetory.IProduitRepository;

@Service
public class PanierService<T extends Entitry> implements IPanierService<Panier> {
	@Autowired
	private IPanierRepository<Panier> panierRepository;

	@Override
	public List<T> getAll() {
		return panierRepository.findAll();
	}



	@Override
	public void deleteFromPanier(Long Id) {
		panierRepository.deleteById(Id);

	}


	@Override
	public void viderPanier(Panier panier) {
		panierRepository.delete(panier);
		
	}


	


	@Override
	public void delete(Long Id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void insert(Object panier) {
		// TODO Auto-generated method stub

		panierRepository.save((Entity) panier);
		
	}



	@Override
	public void insert(Object panier) {
		// TODO Auto-generated method stub
		
	}

}
