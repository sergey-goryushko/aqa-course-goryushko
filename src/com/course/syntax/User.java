package com.course.syntax;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String phoneNumber;
    private Address billingAddress;
    private Address deliveryAddress;
    private Roles role = new Roles("main customer");
    private Manager manager;
    private ArrayList<Card> cards = new ArrayList<>();

    public User(String firstName, String lastName, String email, Roles roles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = roles;
        id = ThreadLocalRandom.current().nextInt(1, 10000);
    }

    public User(String fullName, String email, String role) {
        this.fullName = fullName;
        this.email = email;
        id = ThreadLocalRandom.current().nextInt(1, 10000);
    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Roles getRole() {
        return role;
    }

    public Manager getManager() {
        return manager;
    }

    //requirement -> In process of setting phoneNumber value it must start from + symbol, if not - print an error message.
    public void setPhoneNumber(String phoneNumber) {
        String symbol = "+";
        if (phoneNumber.startsWith(symbol)) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("The error occurs. You need to add + symbol in front of a phone number.");
        }
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setCards(Card card) {
        this.cards.add(card);
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }


    void printUserInfo() {
        System.out.print(toString());
    }

    @Override
    public String toString() {
        return "User{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", fullName='" + fullName + '\'' + ", email='" + email + '\'' + ", phoneNumber='" + phoneNumber + '\'' + ", billingAddress='" + billingAddress + '\'' + ", deliveryAddress='" + deliveryAddress + '\'' + ", role='" + role + '\'' + '}';
    }
}


