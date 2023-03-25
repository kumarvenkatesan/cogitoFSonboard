package com.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Getter
@Setter
@Entity
@Table(name = "customer")
@SuperBuilder
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "fist_name", nullable = false, length = 25)
    private String fistName;

    @NotNull
    @Column(name = "last_name", nullable = false, length = 25)
    private String lastName;

    @NotNull
    @Column(name = "mobile", nullable = false, length = 15)
    private String mobile;

    @NotNull
    //@ValidEmail(firstName = "fn",lastName = "lastName",rollNo = 123)
    @Length(min = 2, max = 30, message = "Name must be between 2-30 characters. ")
    @Column(name = "email", nullable = false, length = 35)
    private String email;

    @Size(max = 55)
    @NotNull
    @Column(name = "address1", nullable = false, length = 55)
    private String address1;

    @Size(max = 55)
    @Column(name = "address2", length = 55)
    private String address2;

    @NotNull
    @Column(name = "pincode", nullable = false)
    private Integer pincode;


    public CustomerEntity() {

    }
}