package com.course.syntax;

public class Helper {
    public static void main(String[] args) throws NumberFormatException {
        User user = new User("D J", "1@1.com", Roles.UserRoles.ADMIN);
        //user.setPhoneNumber("+123");
        user.setCards(new Card("4321 1234 4321 1234", "12/21", 123, Card.PaymentGateways.MASTERCARD));
        user.setCards(new Card("5678 1234 4321 8765", "02/20", 876, Card.PaymentGateways.VISA));
        user.setCards(new Card("5678 1234 4321 0000", "02/30", 576, Card.PaymentGateways.VISA));
        //System.out.println(user.getCards());
        //Broker broker = new Broker("Piotr", "piotr@gmail.com", "+48 123 456 789");
        //System.out.println(broker);
        //user.printInfo();
        //user.printAllCards();
    }
}
