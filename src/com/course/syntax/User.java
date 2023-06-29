package com.course.syntax;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class User {
    public User() {
    }

    public static void main(String[] args) {
        User user = new User();
        user.setPhoneNumber("+1(555)555-1234");
        user.setBillingAddress(String.valueOf(new Address("Spain", "Madrid", "Puerta del Sol", "1", "01-101")));
        user.setDeliveryAddress(String.valueOf(new Address("Spain", "Madrid", "Puerta del Sol", "1", "01-101")));
        user.getRole();
        user.printUserInfo();
    }
    //    requirements ->
    //    A User object must be created with values of fullName, email and role type or
    //    firstName, lastName, email and role type.

    public User(String firstName, String lastName, String email, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        Roles roles = new Roles(true, true, true, true);//it's admin type
        this.role = roles.roleType;
        id = ThreadLocalRandom.current().nextInt(1, 10000);
    }

    public User(String fullName, String email, String role) {
        this.fullName = fullName;
        this.email = email;
        Roles roles = new Roles(true, false, true, false);//it's customer type
        this.role = roles.roleType;
        id = ThreadLocalRandom.current().nextInt(1, 10000);
    }


    private int id;
    private String firstName = "Andy";
    private String lastName = "Cole";
    private String fullName = "Andy Cole";
    private String email = "a@c.gmail.com";
    private String phoneNumber;
    private String billingAddress;
    private String deliveryAddress;
    private String role;
    private String manager;
    private ArrayList<Card> cards = new ArrayList<>();

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

    public String getBillingAddress() {
        return billingAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public String getRole() {
        Roles roles = new Roles(true, true, true, false);//it's main customer type
        this.role = roles.roleType;
        return role;
    }

    public String getManager() {
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

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setCards(Card card) {
        this.cards.add(card);
    }

    public void setManager(String manager) {
        this.manager = manager;
    }


    void printUserInfo() {
        System.out.print(toString());
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}


