package me.maktoba.LeetCode;

public class RemoveDuplicatesSorted {

    public int removeDuplicates(int[] nums) {

        int a_pointer = 0;
        int b_pointer = 1;
        while (b_pointer < nums.length) {
            if (nums[a_pointer] != nums[b_pointer]) {
                a_pointer++;
                nums[a_pointer] = nums[b_pointer];
            }
            b_pointer++;
        }

        return a_pointer + 1;
    }

}
