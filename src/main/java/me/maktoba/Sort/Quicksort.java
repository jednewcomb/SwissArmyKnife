package me.maktoba.Sort;
import java.util.Random;

public class Quicksort {

    public static void swap(int[] array, int value1, int value2) {
        int temp = array[value1];
        array[value1] = array[value2];
        array[value2] = temp;
    }

    public static void quicksort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) return;

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;//should look at this closer
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

    public static void quicksort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    public static void print(int[] array) {
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

