package com.course.syntax;

public class IncrementDecrement {
    static int value = 5;

    static void preIncrement() {
        for (int i = 0; i < value; ++i) {
            System.out.println(i);
        }
    }

    static void preDecrement() {
        for (int j = 10; j > value; --j) {
            System.out.println(j);
        }
    }

    static void postIncrement() {
        for (int i = 0; i < value; i++) {
            System.out.println(i);
        }
    }

    static void postDecrement() {
        for (int j = 10; j > value; j--) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        System.out.println("Here is the example of pre increment.");
        IncrementDecrement.preIncrement();
        System.out.println("Here is the example of pre increment.");
        IncrementDecrement.preDecrement();
        System.out.println("Here is the example of post increment.");
        IncrementDecrement.postIncrement();
        System.out.println("Here is the example of post decrement.");
        IncrementDecrement.postDecrement();
    }
}