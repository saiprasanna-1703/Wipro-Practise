package com.wipro.springboot_mongodb.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.wipro.springboot_mongodb.entity.Passenger;
import com.wipro.springboot_mongodb.repository.PassengerRepository;

class PassengerControllerTest {


    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    PassengerRepository userRepository;

    @Order(1)
    @Test
    void testDb() {
        Assertions.assertThat(mongoTemplate.getDb()).isNotNull();
    }

    @Order(2)
    @Test
    void testSave() {
        Passenger user = new Passenger();
        user.setId("1");
        user.setName("Foo Bar");
        user.setEmail("foo.bar@gmail.com");

        Passenger user2 = new Passenger();
        user2.setId("2");
        user2.setName("Foo Bar");
        user2.setEmail("foo.bar@gmail.com");


        userRepository.save(user);
        userRepository.save(user2);

        Passenger result = mongoTemplate.findById("1",Passenger.class);

        assertEquals(result.getId(), user.getId());
        assertEquals(result.getEmail(), user.getEmail());
        assertEquals(result.getName(), user.getName());
    }

    @Order(3)
    @Test
    void testFindById() {
        Optional<Passenger> userOptional = userRepository.findById("1");
         assertTrue(userOptional.isPresent());
         Passenger result = userOptional.get();
        assertEquals("1", result.getId());
        assertEquals("Foo Bar", result.getName());
        assertEquals("foo.bar@gmail.com", result.getEmail());
    }

    @Order(4)
    @Test
    void testDeleteById() {
        userRepository.deleteById("1");
        assertFalse(userRepository.existsById("1"));
    }

	

}
