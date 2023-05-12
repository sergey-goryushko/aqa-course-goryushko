package com.course.syntax;

import java.util.Scanner;

public class Loops {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Loops loops = new Loops();
        loops.printValue();
        loops.factorial();
        loops.largestDivisor();
        loops.requestAge();

    }

    public void printValue() {
        System.out.println("Enter your number below to print its range values");
        int givenValue = scanner.nextInt();
        int initialValue = 0;

        do {
            if (givenValue < 0) {
                System.out.println("An error occurs!");
            } else if (initialValue % 3 == 0 && initialValue != 0) {
                System.out.println("The number multiple to 3");

            } else if (initialValue % 2 == 0) {
                System.out.println(initialValue + " The number is even");

            } else {
                System.out.println(initialValue);
            }
            initialValue++;
        } while (initialValue < givenValue);
        System.out.println("\n");
    }

    public void factorial() {
        System.out.println("Enter your number below to calculate its factorial.");
        int givenValueForFactorial = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= givenValueForFactorial; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of the " + givenValueForFactorial + " is " + factorial + "\n");

    }

    public void largestDivisor() {
        System.out.println("Enter you number to find out its largest integer divisor.");
        int givenValue = scanner.nextInt();
        int largestDivisor = 0;
        for (int i = 1; i <= givenValue / 2; i++) {
            if (givenValue % i == 0)
                largestDivisor = i;
        }
        System.out.println(largestDivisor + "\n");
    }


    public void requestAge() {
        System.out.println("Enter your age, please.");
        while (scanner.hasNextInt()) {
            int givenAge = scanner.nextInt();
            if (givenAge > 140 || givenAge <= 0) {
                System.out.println("An error occurs!");
                System.out.println("Try to enter correct age value, please.");
            } else {
                System.out.println("Done! You're looking great for your age. :) ");
                break;
            }
        }
    }
}


