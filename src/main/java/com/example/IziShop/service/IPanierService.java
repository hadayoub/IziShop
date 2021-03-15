package com.example.IziShop.service;

import com.example.IziShop.entity.Panier;



public interface IPanierService<T> extends IService<Panier> {

	void viderPanier(T panier);
}
 