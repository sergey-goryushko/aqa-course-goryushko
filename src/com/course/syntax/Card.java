package com.course.syntax;

import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;

public class Card {
    private int id;
    private String number;
    private String expireDate;
    private int cvv;
    private PaymentGateways cardType;

    public enum PaymentGateways {
        MASTERCARD, VISA;
    }

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

    public void setCardType(PaymentGateways paymentGateways) {
            cardType = paymentGateways;
    }


    public Card(String number, String expireDate, int cvv, PaymentGateways paymentGateways) {
        id = ThreadLocalRandom.current().nextInt(1, 10000);
        this.number = number;
        this.expireDate = expireDate;
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "Card{" + "id=" + id + ", number='" + number + '\'' + ", expireDate='" + expireDate + '\'' + ", cvv=" + cvv + ", cardType='" + cardType + '\'' + '}';
    }
}
