package me.maktoba;

public class IsNumberPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        //we need 3 helper variables here:

        //reversed is the number "string" we'll use to compare to
        //our original later
        int reversed = 0;

        //temp references original number, and will be used to
        //control our loop condition
        int temp = x;

        //digit, found in the loop, will be the righter most
        //extracted digit that will be added to our first var,
        //reversed.

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