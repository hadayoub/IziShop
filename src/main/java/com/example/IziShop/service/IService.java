package com.example.IziShop.service;

import java.util.List;

import com.example.IziShop.entity.Entity;

public interface IService<T extends Entity> {
	List<T> getAll();

	void insert(T panier);


	void delete(Long Id);
}