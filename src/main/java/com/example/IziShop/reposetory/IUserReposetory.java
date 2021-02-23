package com.example.IziShop.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.IziShop.entity.User;

@Repository
public interface IUserReposetory extends JpaRepository<User, Long> {

}
