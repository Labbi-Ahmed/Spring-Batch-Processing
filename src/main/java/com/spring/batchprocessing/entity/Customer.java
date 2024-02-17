package com.spring.batchprocessing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Customer {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String company;
    private String city;
    private String country;
    private String phone;
    private String email;
    private String website;

}
