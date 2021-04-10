package com.example.IziShop.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.IziShop.entity.Produit;
import com.example.IziShop.service.IProduitService;


@RestController
@RequestMapping("/produit")
public class ProduitController {
	@Autowired
	private IProduitService produitService;
	
	@GetMapping("/all")
	public 	ResponseEntity<List<Produit>> getAllProduit(){
		return new ResponseEntity<>(produitService.getAll(), HttpStatus.OK);
	}
	
	@PostMapping("/addProduit")
	public void addProduit(@RequestBody Produit produit) {
		produitService.addProduit(produit);
		
	}
	@DeleteMapping("/deleteProduit")
	public void deleteProduit(@RequestBody Long Id ) {
		produitService.deleteProduit(Id);
		
	}
	
	@PutMapping("/UpdateProduit/{Id}")
	public void UpdateProduit(@RequestBody Produit produit, @PathVariable long Id) {
		produitService.UpdateProduit(produit, Id);
	}
	
	@PutMapping("/incrementProduit/{Id}/{Qte}")
	public void addStockProduit(@PathVariable long Id, @PathVariable long Qte) {		
		produitService.increment(Id, Qte);
	}
	@PutMapping("/decrementProduit/{Id}/{Qte}")
	public void deleteStockProduit(@PathVariable long Id, @PathVariable long Qte) {		
		produitService.decrement(Id, Qte);
	}
	  
	

}
