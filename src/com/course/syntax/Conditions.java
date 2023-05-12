package com.course.syntax;

import java.util.Scanner;

public class Conditions {
    Scanner scanner = new Scanner(System.in);
    int wholeNumber;
    double doubleNumber;
    float floatNumber;

    public void scanInt() {
        System.out.println("Enter whole number.");
        wholeNumber = scanner.nextInt();
        if (wholeNumber < 10 && wholeNumber != 0) {
            System.out.println("Your number is less than 10.");
        } else if (wholeNumber > 10) {
            System.out.println("Your number is greater than 10.");
        } else if (wholeNumber == 0) {
            System.out.println("Your number is zero.");
        }
    }

    public void scanDouble() {
        System.out.println("Enter a number in double format.");
        doubleNumber = scanner.nextDouble();
        if (doubleNumber % 2 != 0) {
            System.out.println(doubleNumber + " is odd.");
        } else {
            System.out.println(doubleNumber + " is even.");
        }
    }

    public void scanFloat() {
        System.out.println("Enter a number in float format.");
        floatNumber = scanner.nextFloat();
        if ((floatNumber % 2 == 0 && floatNumber > 10) || floatNumber == 15) {
            System.out.println("first message");
        } else {
            System.out.println("second message");
        }

    }

    public static void main(String[] args) {
        Conditions conditions = new Conditions();
        conditions.scanInt();
        conditions.scanDouble();
        conditions.scanFloat();
    }
}

