package com.wipro.springboot_mongodb.controller;import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.springboot_mongodb.entity.Passenger;
import com.wipro.springboot_mongodb.repository.PassengerRepository;

@RestController
@RequestMapping("/api")
public class PassengerController {
    @Autowired
    private PassengerRepository userRepository;

    @GetMapping("/users")
    public List<Passenger> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/user")
    public Passenger createUser(@RequestBody Passenger user) {
        return userRepository.save(user);
    }

    @GetMapping("/user/{id}")
    public Passenger getUser(@PathVariable String id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @PutMapping("/user/{id}")
    public Passenger updateUser(@PathVariable String id, @RequestBody Passenger user) {
    	Passenger existingUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        return userRepository.save(existingUser);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable String id) {
        userRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}

