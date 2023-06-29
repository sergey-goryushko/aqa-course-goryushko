package com.course.syntax;

import java.util.concurrent.ThreadLocalRandom;

public class Address {
    private int id;
    private String country;
    private String city;
    private String street;
    private String building;
    private String room;
    private String zipCode;

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getBuilding() {
        return building;
    }

    public String getRoom() {
        return room;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Address(String country, String city, String street, String building, String zipCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
        this.zipCode = zipCode;
        id = ThreadLocalRandom.current().nextInt(1, 10000);
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building='" + building + '\'' +
                ", room='" + room + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
