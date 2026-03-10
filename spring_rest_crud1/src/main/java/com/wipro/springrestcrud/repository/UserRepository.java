package com.wipro.springrestcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.springrestcrud.entity.UserEntity;


public interface UserRepository extends JpaRepository<UserEntity, Long>{
    public UserEntity findByUserName(String username);
}
