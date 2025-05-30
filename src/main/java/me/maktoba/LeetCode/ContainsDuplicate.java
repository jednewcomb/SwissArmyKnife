package me.maktoba.LeetCode;

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] array) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {
                return true;
            }
            set.add(array[i]);
        }
        return false;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate(nums2));
        System.out.println(containsDuplicate(nums3));
    }
}
