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



    public static void main(String[] args) {
        int[] array = new int[50];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");

        System.out.println(binarySearch(scanner.nextInt(), array));

    }

}