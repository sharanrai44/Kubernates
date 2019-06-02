package com.kubernates.UserManagement.rest;

import com.kubernates.UserManagement.domain.User;
import com.kubernates.UserManagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<String> addUsers(@RequestBody User user) {

        userRepository.save(user);
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
