package me.maktoba.LeetCode;

import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String firstPrefix = strs[0];
        String lastPrefix = strs[strs.length - 1];

        int index = 0;

        while (index < firstPrefix.length() && index < lastPrefix.length()) {
            if (firstPrefix.charAt(index) == lastPrefix.charAt(index)) {
                index++;
            } else {
                break;
            }
        }

        return firstPrefix.substring(0, index);
    }

}
