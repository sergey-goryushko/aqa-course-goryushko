package com.course.syntax;

import java.util.ArrayList;

public class Broker implements PrintInfo {
    private String name;
    private String email;
    private String phoneNumber;
    private ArrayList<User> clientsList = new ArrayList<>();

    public Broker(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Broker{" + "name='" + name + '\'' + ", email='" + email + '\'' + ", phoneNumber='" + phoneNumber + '\'' + '}';
    }

    @Override
    public void printInfo() {
        System.out.println(toString());
    }
}
