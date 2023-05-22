package com.course.syntax;

import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class Strings {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Strings strings = new Strings();
        strings.deleteSpacesAndMakeLineInUppercase();
        strings.checkThatSentenceContainsWordJava();
        strings.countNumberOfCertainLettersInTheSentence();
        strings.alterPascalCase();
    }

    public void deleteSpacesAndMakeLineInUppercase() {
        System.out.println("Enter your sentence below, please:");
        String text = scanner.nextLine();
        String alteredLine = text.trim().toUpperCase();
        System.out.println("Here is we have the string without blanks and wrote with an uppercase: " + alteredLine + "\n");
    }

    public void checkThatSentenceContainsWordJava() {
        System.out.println("Enter your sentence below, please:");
        String text = scanner.nextLine();
        boolean result = text.contains("java");
        if (result) {
            char[] array = text.toCharArray();
            System.out.print("Congrats! Your string contains the java word therefore I printed your content in the reverse order: ");
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i]);
            }
        } else {
            String[] arrayWords = text.split(" ");
            System.out.print("Due to your line doesn't contain the java word I printed each even word in uppercase: ");
            for (int word = 0; word < arrayWords.length; word++) {
                if (word % 2 == 1) {
                    System.out.print(arrayWords[word].toUpperCase() + " ");

                } else {
                    System.out.print(arrayWords[word] + " ");
                }
            }
        }
        System.out.println("\n");
    }

    public void countNumberOfCertainLettersInTheSentence() {
        System.out.println("Enter your sentence below, please: ");
        String sentence = scanner.nextLine();
        System.out.println("Enter your letter quantity of what you wish to count: ");
        char[] symbol = scanner.next().toCharArray();
        char[] symbolsOfString = sentence.toCharArray();
        int count = 0;
        for (char k : symbolsOfString) {
            if (k == symbol[0]) {
                count++;
            }
        }
        System.out.println("Sum of you symbols is: " + count + "\n");
    }

    public void alterPascalCase() {
        System.out.println("Enter your sentence below in Pascal Case view, please:");
        String text = scanner.next();
        char[] arrayChars = text.toCharArray();
        System.out.print("New string representation looks like this: ");
        for (char i : arrayChars) {
            if (isUpperCase(i)) {
                System.out.print(" " + i);
            } else {
                System.out.print(i);
            }
        }
    }
}