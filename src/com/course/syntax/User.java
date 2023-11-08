package com.course.syntax;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class User implements PrintInfo {

    private int id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String phoneNumber;
    private Address billingAddress;
    private Address deliveryAddress;
    private Roles.UserRoles UserRoles;
    private Manager manager;
    private ArrayList<Card> cards = new ArrayList<>();

    public void printAllCards() {
        cards.forEach(card -> {
            System.out.println(card.getNumber());
        });
    }

    @Override
    public void printInfo() {
        System.out.println(toString());
    }


    public User(String firstName, String lastName, String email, Roles.UserRoles userRoles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.UserRoles = userRoles;
        id = ThreadLocalRandom.current().nextInt(1, 10000);
    }

    public User(String fullName, String email, Roles.UserRoles userRoles) {
        this.fullName = fullName;
        this.email = email;
        this.UserRoles = userRoles;
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

    public Roles.UserRoles getUserRoles() {
        return UserRoles;
    }

    public Manager getManager() {
        return manager;
    }

    //requirement -> In process of setting phoneNumber value it must start from + symbol, if not - print an error message.
    public void setPhoneNumber(String phoneNumber) {
        String symbol = "+";
        try {
            if (phoneNumber.startsWith(symbol)) {
                this.phoneNumber = phoneNumber;
                System.out.println("Your phone number was saved successfully.");
            } else {
                throw new CheckFormatPhone("The error occurs. You need to add + symbol in front of a phone number.");
            }
        } catch (CheckFormatPhone e) {
            e.printStackTrace();
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

    @Override
    public String toString() {
        return "User{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", fullName='" + fullName + '\'' + ", email='" + email + '\'' + ", phoneNumber='" + phoneNumber + '\'' + ", billingAddress='" + billingAddress + '\'' + ", deliveryAddress='" + deliveryAddress + '\'' + ", role='" + UserRoles + '\'' + '}';
    }
}


