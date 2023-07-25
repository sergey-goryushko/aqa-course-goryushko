package com.course.syntax;

public class Parent {
    public Parent() {
        System.out.println("First line.");
    }

    static {
        System.out.println("Second line.");
    }

    {
        System.out.println("Third line.");
    }
}
