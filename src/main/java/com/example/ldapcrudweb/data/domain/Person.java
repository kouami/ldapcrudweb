package com.example.ldapcrudweb.data.domain;


import lombok.*;

@Data
public class Person {

    private String userName;
    private String password;
    private String fullName;
    private String lastName;
    private String initials;
    private String displayName;
    private Address address;

    public Person(){}

}
