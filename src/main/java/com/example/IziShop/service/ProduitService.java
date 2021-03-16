package com.example.IziShop.service;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.example.IziShop.entity.Produit;
import com.example.IziShop.reposetory.IProduitRepository;

@Repository("IProduitService")
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
	@Override
	public void increment(Long Id, Long qte) {
		
		Optional<Produit> produitO = produitRepository.findById(Id);
		Produit produit =  produitO.get();
		qte += produit.getQte_stock();
		produit.setQte_stock(qte);
		produitRepository.save(produit);
		
	}
	@Override
	public void decrement(Long Id, Long qte ) {
		Optional<Produit> produitO = produitRepository.findById(Id);
		Produit  produit =  produitO.get();
		qte =  produit.getQte_stock() - qte;
		produit.setQte_stock(qte);
		produitRepository.save(produit);
	}

	@Override
	public Produit get(Long id) {
		return produitRepository.getOne(id);
	}





}
