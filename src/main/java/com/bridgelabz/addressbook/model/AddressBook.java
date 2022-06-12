package com.bridgelabz.addressbook.model;

public class AddressBook {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Long phoneNumber;
    private String city;
    private String state;
    private Integer zip;


    public AddressBook(Integer id, String firstName, String lastName, String email, Long phoneNumber, String city, String state, Integer zip) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
}
