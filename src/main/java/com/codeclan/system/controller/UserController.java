package com.codeclan.system.controller;

import com.codeclan.system.models.User;
import com.codeclan.system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@RequestMapping(value = "/users")
public class UserController {

        @Autowired
        UserRepository userRepository;

        @GetMapping()
        public List<User> getAllUsers(){
                return userRepository.findAll();
        }

        @GetMapping("/{id}")
        public Optional<User> getUser(@PathVariable Long id){
                return userRepository.findById(id);
        }
}

