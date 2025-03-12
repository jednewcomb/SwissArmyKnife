package me.maktoba.LeetCode;

import java.util.List;
import java.util.ArrayList;
public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz(25));
    }

    //This version adds the output to an array and returns it
    public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            String output = "";
            if (i % 3 == 0) output += "Fizz";
            if (i % 5 == 0) output += "Buzz";

            ans.add(output.length() == 0 ? Integer.toString(i) : output);
        }

        return ans;
    }

}
