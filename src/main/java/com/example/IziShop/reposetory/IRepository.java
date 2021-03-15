package com.example.IziShop.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.IziShop.entity.Entity;

public interface IRepository<T extends Entity, ID> extends JpaRepository<Entity,Long> {

}
