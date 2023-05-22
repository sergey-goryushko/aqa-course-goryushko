package com.course.syntax;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Massifs {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Massifs massifs = new Massifs();
        massifs.averageValueOfGivenArray();
        massifs.mergeArrays();
        massifs.findBiggestValueOfArray();
        massifs.sortArrayByAscendingOrder();
    }

    public void averageValueOfGivenArray() {
        System.out.println("Define the size of your array:");
        int[] givenNumbers = new int[scanner.nextInt()];
        int sum = 0;
        int average;
        for (int i = 0; i < givenNumbers.length; i++) {
            givenNumbers[i] = i + 1;
        }
        for (int j : givenNumbers) {
            sum += j;
        }
        average = sum / 2;
        System.out.println("The average value of given array is: " + average + "\n");
    }

    public void mergeArrays() {
        System.out.println("Define the size of the first array:");
        int[] firstArray = new int[scanner.nextInt()];
        System.out.println("Define the size of the second array:");
        int[] secondArray = new int[scanner.nextInt()];
        int totalLength = firstArray.length + secondArray.length;
        int[] mergedArray = new int[totalLength];
        for (int i = 0; i < mergedArray.length; i++) {
            mergedArray[i] = i;
        }
        System.out.println("So that looks the merged array: " + Arrays.toString(mergedArray) + "\n");
    }

    public void findBiggestValueOfArray() {
        int range = 1000;
        Random random = new Random();
        System.out.println("Define the size of the array:");
        int[] randomArray = new int[scanner.nextInt()];
        for (int i = 0; i < randomArray.length; i++) {
            int randomNumbers = random.nextInt(range);
            randomArray[i] = randomNumbers;
            System.out.print(randomArray[i] + " ");
        }

        int maxValue = randomArray[0];
        for (int k = 0; k < randomArray.length; k++) {
            if (randomArray[k] > maxValue) {
                maxValue = randomArray[k];
            }
        }
        System.out.print("\n" + "The biggest value of the array is: " + maxValue + "\n");
    }

    public void sortArrayByAscendingOrder() {
        int range = 1000;
        Random random = new Random();
        System.out.println("\n" + "Define the size of the array:");
        int[] randomArray = new int[scanner.nextInt()];
        for (int i = 0; i < randomArray.length; i++) {
            int randomNumbers = random.nextInt(range);
            randomArray[i] = randomNumbers;
        }
        int temporaryValue;
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = i; j < randomArray.length; j++) {
                if (randomArray[i] > randomArray[j]) {
                    temporaryValue = randomArray[i];
                    randomArray[i] = randomArray[j];
                    randomArray[j] = temporaryValue;
                }
            }
        }
        System.out.print("This array was sorted in ascending order: ");
        for (int k = 0; k < randomArray.length; k++) {
            System.out.print(randomArray[k] + " ");
        }
    }
}