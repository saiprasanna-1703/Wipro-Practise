package com.wipro.springboot_mongodb.repository;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wipro.springboot_mongodb.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    void deleteById(String id);

    Optional<User> findById(String id);

    boolean existsById(String id);
}