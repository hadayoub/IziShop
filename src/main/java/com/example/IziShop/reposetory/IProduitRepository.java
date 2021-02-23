package com.example.IziShop.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.IziShop.entity.Produit;

@Repository
public interface IProduitRepository extends JpaRepository<Produit,Long>{

}
