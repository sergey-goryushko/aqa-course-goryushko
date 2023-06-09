package com.course.syntax;

import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;

public class Card {
    private int id;
    private String number;
    private String expireDate;
    private int cvv;
    private String cardType;

    String regex = "^mastercard|visa$";

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
        boolean result = Pattern.matches(regex, cardType);
        if (result) {
            this.cardType = cardType;
        } else {
            System.out.println("The system takes only cards with Visa or Master Card types.");
        }
    }

    public Card(String number, String expireDate, int cvv, String cardType) {
        id = ThreadLocalRandom.current().nextInt(1, 10000);
        boolean result = Pattern.matches(regex, cardType);
        if (result) {
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
        return "Card{" + "id=" + id + ", number='" + number + '\'' + ", expireDate='" + expireDate + '\'' + ", cvv=" + cvv + ", cardType='" + cardType + '\'' + '}';
    }
}
