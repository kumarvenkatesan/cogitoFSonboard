package com.controller;

import com.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created on February, 2020
 *
 * @author kamer
 */
@RestController
@RequestMapping("/api/users")
public class UserRestController {

    @PostMapping
    public ResponseEntity<Customer> saveUser(@Valid @RequestBody Customer user) {

        return ResponseEntity.ok(user);
    }



}