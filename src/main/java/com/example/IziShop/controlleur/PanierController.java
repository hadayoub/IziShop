package com.example.IziShop.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.IziShop.entity.Panier;
import com.example.IziShop.entity.Produit;
import com.example.IziShop.entity.User;
import com.example.IziShop.service.IPanierService;


@RestController
@RequestMapping("/Panier")
public class PanierController {
	
	@Autowired
	private IPanierService panierService;
	
	
	@PostMapping("/addToPanier")
	public void addToPanier(@RequestBody Panier panier ) {
		panierService.addToPanier(panier);
	}
	
	@GetMapping("/AllPanier")
	public 	ResponseEntity<List<Panier>> getAll(){
		return new ResponseEntity<>(panierService.getAll(), HttpStatus.OK);
	}

	
}
