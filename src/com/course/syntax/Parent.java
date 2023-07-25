package com.course.syntax;

public class Parent {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent.Child child = parent.new Child();
    }

    public Parent() {
        System.out.println("First line.");
    }

    static {
        System.out.println("Second line.");
    }

    {
        System.out.println("Third line.");
    }

    public class Child {
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
}
