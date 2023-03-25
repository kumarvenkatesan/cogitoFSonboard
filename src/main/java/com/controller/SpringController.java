package com.controller;

import com.entity.CustomerEntity;
import com.model.Customer;
import com.repository.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Tag(description = "User API", name = "User Services")
@RestController
public class SpringController {

     @Autowired
     UserRepository userRepository;

    @PostMapping("/onboard-customer")
    @Operation(summary = "Customer on-board ",
            responses = {
                    @ApiResponse(responseCode = "200",
                            description = "Returns the Customer on-board ",
                            content = @Content(mediaType = "application/json",
                                    schema = @Schema(implementation = Customer.class)))
            })
    public ResponseEntity<Customer> register(@Valid @RequestBody Customer customer) {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setFistName(customer.getFirstName());
        customerEntity.setLastName(customer.getLastName());
        customerEntity.setMobile(customer.getMobile());
        customerEntity.setEmail(customer.getEmail());
        customerEntity.setAddress1(customer.getAddress1());
        customerEntity.setAddress2(customer.getAddress2());
        customerEntity.setPincode(customer.getPincode());
        userRepository.save(customerEntity);
        return ResponseEntity.ok(customer);
    }


}
