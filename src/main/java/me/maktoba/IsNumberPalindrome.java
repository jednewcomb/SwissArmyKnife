package me.maktoba;

public class IsNumberPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reversed = 0;
        int temp = x;

        //6       8       3

        while (temp != 0) {
            int digit = temp % 10;
            reversed = (reversed * 10) + digit;
            temp = temp / 10;
        }

        return reversed == x;
    }

    public static void main(String[] args) {

    }
}