package com.model;


import com.exception.ValidateField;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Created on February, 2020
 *
 * @author kamer
 */
@Data

public class Customer {

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    private String mobile;

    private String email;

    private String address1;

    private String address2;

    private Integer pincode;


}