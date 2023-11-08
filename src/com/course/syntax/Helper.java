package com.course.syntax;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Helper {
    public static void main(String[] args) throws Exception {
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

        while (true) {
            System.out.println("If you would like to add user type 1 or enter 2 to print their list.");
            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                System.out.println("Enter user name: ");
                String fName = scanner.next();
                System.out.println("Enter user last name: ");
                String lName = scanner.next();
                System.out.println("Enter user email: ");
                String mail = scanner.next();
                User user1 = new User(fName, lName, mail, Roles.UserRoles.VIEWER);
                System.out.println("User was successfully added!" + "\n");
                try {
                    FileWriter writer = new FileWriter("Users.csv", true);
                    writer.write(user1 + "\n");
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (userChoice == 2) {
                try {
                    List<String> allLines = Files.readAllLines(Paths.get("Users.csv"));
                    for (String line : allLines) {
                        System.out.println(line + "\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Choose between available options, please. To add user type 1 or enter 2 to print their list.");
            }
        }
    }
}
