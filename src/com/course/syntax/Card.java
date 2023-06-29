package com.course.syntax;

import java.util.concurrent.ThreadLocalRandom;

public class Card {
    private int id;
    private String number;
    private String expireDate;
    private int cvv;
    private String cardType;

    public Integer getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Card(String number, String expireDate, int cvv, String cardType) {
        id = ThreadLocalRandom.current().nextInt(1, 10000);
        if (cardType.equals("Visa") || cardType.equals("Master Card")) {
            this.cardType = cardType;
        } else {
            System.out.println("The system takes only cards with Visa or Master Card types.");
        }
        this.number = number;
        this.expireDate = expireDate;
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", cvv=" + cvv +
                ", cardType='" + cardType + '\'' +
                '}';
    }
}
