package com.example.IziShop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.example.IziShop.entity.Produit;
import com.example.IziShop.reposetory.IProduitRepository;


@Service
public class ProduitService implements IProduitService {
	@Autowired
	private IProduitRepository produitRepository;

	
	@Override
	public List<Produit> getAll() {
		return produitRepository.findAll();
	}

	@Override
	public void addProduit(Produit produit) {
		produitRepository.save(produit);
		
	}
	@Override
	public void deleteProduit(Long Id) {
		produitRepository.deleteById(Id);

	}

	@Override
	public ResponseEntity<Object> UpdateProduit( Produit produit,long Id) {
		produitRepository.findById(Id);
		if (!produitRepository.existsById(Id))
		{
			return ResponseEntity.notFound().build();
		}
		produit.setId(Id);
		produitRepository.save(produit);
		return ResponseEntity.noContent().build();
						
	}

}
