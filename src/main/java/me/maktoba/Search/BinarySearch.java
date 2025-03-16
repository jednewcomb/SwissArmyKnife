package me.maktoba.Search;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int num, int[] array) {
        int left = 0;
        int right = array.length - 1;

        //while our left pointer is less than or equal to the right pointer
        //set a variable equal to the middle of the array,
        //and check if its equal to our desired number

        while (left <= right) {
            int mid = (left + right) / 2;

            if (array[mid] == num) {
                return num;
            }

            if (array[mid] < num) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static int binarySearchRecursive(int[] array, int num) {
        if (array == null) {
            return -1;
        }

        return binarySearchRecursive(array, num, 0, array.length - 1);
    }

    private static int binarySearchRecursive(int[] array, int num, int left, int right) {
        if (left > right) {
            return -1;
        }

        int middle = (left + right) / 2;
        if (array[middle] == num) {
            return middle;
        }
        else if (array[middle] > num) {
            return binarySearchRecursive(array, num, left, middle - 1);
        }
        else {
            return binarySearchRecursive(array, num, middle + 1, right);
        }
    }



    public static void main(String[] args) {
        int[] array = new int[50];

        for (int i = 0; i < array.length; i++) {
                array[i] = i * 2;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 50");

        System.out.println(binarySearch(scanner.nextInt(), array));
        System.out.println(binarySearchRecursive(array, scanner.nextInt()));

    }

}