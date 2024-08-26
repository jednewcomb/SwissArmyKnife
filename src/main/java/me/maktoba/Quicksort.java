package me.maktoba;

import java.util.Random;

public class Quicksort {

    private static void swap(int[] array, int value1, int value2) {
        int temp = array[value1];
        array[value1] = array[value2];
        array[value2] = temp;
    }

    private static void quicksort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        //pivotIndex = reference to its position in the array
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;

        //pivot = the value found in the array at pivotIndex
        int pivot = array[pivotIndex];

        swap(array, pivotIndex, highIndex);

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);

        }

        swap(array, leftPointer, highIndex);

        quicksort(array, lowIndex, leftPointer - 1);
        quicksort(array, leftPointer + 1, highIndex);

    }

    private static void quicksort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private static void print(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100) + 1;
        }

        print(array);

        quicksort(array);

        print(array);
    }

}

