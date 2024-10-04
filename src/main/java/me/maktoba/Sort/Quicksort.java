package me.maktoba.Sort;
import java.util.Random;

public class Quicksort {

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void quicksort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        //lets set up the beginning of the sort
        //i think what we want to do is:
        //choose pivot randomly
        //put it at the end
        //remember the index of it and swap it to the end

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex; //randomly chooses pivot
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
        for (int nums : array) {
            System.out.print(nums + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int [10];
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100) + 1;
        }

        print(array);
        quicksort(array);
        print(array);

    }



}

