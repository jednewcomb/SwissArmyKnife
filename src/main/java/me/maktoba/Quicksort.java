package me.maktoba;

import java.util.Random;

public class Quicksort {

    private static void swap(int[] array, int val1, int val2) {
        int temp = array[val1];
        array[val1] = array[val2];
        array[val2] = temp;
    }

    private static void quicksort(int[] array, int lowIndex, int highIndex) {
        //cover case where no number to sort was found
        if (lowIndex >= highIndex) {
            return;
        }

        //pick a pivot randomly in order to improve the complexity of algorithm
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = array[pivotIndex];
        //place our pivot value at the end of the array to
        //"keep it out of the way" of our pointers so to speak
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
        int[] array = new int[10];

        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100) + 1;
        }

        print(array);

        quicksort(array);

        print(array);
    }

}

