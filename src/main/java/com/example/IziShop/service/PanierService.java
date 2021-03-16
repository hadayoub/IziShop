package com.example.IziShop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.IziShop.entity.Panier;
import com.example.IziShop.reposetory.IPanierRepository;

@Service
public class PanierService implements IPanierService {
	@Autowired
	private IPanierRepository panierRepository;

	@Override
	public List<Panier> getAll() {
		return panierRepository.findAll();
	}


	@Override
	public void addToPanier(Panier panier) {
		panierRepository.save(panier);
		
	}

	@Override
	public void deleteFromPanier(Long Id) {
		panierRepository.deleteById(Id);

	}


	@Override
	public void viderPanier(Panier panier) {
		panierRepository.delete(panier);
		
	}

}
