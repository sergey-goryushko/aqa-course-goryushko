package com.course.syntax;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of first side of triangle.");
    int firstSide, secondSide, thirdSide;
    firstSide = scanner.nextInt();
        System.out.println("Enter the value of second side of triangle.");
        secondSide = scanner.nextInt();
        System.out.println("Enter the value of third side of triangle.");
        thirdSide = scanner.nextInt();
    int semiPerimeter = (firstSide + secondSide + thirdSide)/2;
    int triangleArea = (int) Math.sqrt(semiPerimeter * (semiPerimeter - firstSide) * (semiPerimeter - secondSide) * (semiPerimeter - thirdSide));
        System.out.println("Area of your triangle is: " + triangleArea);
}}
