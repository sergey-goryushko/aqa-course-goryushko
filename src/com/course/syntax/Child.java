package com.course.syntax;

public class Child extends Parent {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child);
    }

    public Child() {
        System.out.println("Fourth line.");
    }

    static {
        System.out.println("Fifth line.");
    }

    {
        System.out.println("Sixth line.");
    }
}

