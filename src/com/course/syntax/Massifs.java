package com.course.syntax;

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
            givenNumbers[i] = i;
        }
        for (int j : givenNumbers) {
            sum += j;
        }
        average = sum / givenNumbers.length;
        System.out.println("The average value of given array is: " + average + "\n");
    }

    public void mergeArrays() {
        int i = 0, j = 0, k = 0;
        int[] firstArray = {1, 2, 3, 4};
        int[] secondArray = {5, 6, 8, 12, 4};
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        while (i < firstArray.length) {
            mergedArray[k++] = firstArray[i++];
        }
        while (j < secondArray.length) {
            mergedArray[k++] = secondArray[j++];
        }
        System.out.print("The merged arrays looks like this: ");
        for (int elementOfMergedArray : mergedArray) {
            System.out.print(elementOfMergedArray + " ");
        }
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