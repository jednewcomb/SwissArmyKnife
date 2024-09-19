package me.maktoba.LeetCode;

public class RemoveElement {
    private static int removeElement(int[] nums, int val) {
        //check if empty array
        if (nums.length == 0) {
            return 0;
        }

        //our second pointer(iterator), which will also return the "new" array "size"
        int valid_size = 0;

        //if our current element isn't the value to "remove",
        //set our second indexes element to that element
        //and iterate both. otherwise just iterate our loop iterator
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[valid_size] = nums[i];
                valid_size++;
            }
        }

        return valid_size;
    }

    public static void main(String[] args) {
        int[] testOne = {3, 2, 2, 3};

        int[] testTwo = {0, 1, 2, 2, 3, 0, 4, 2};

        System.out.println(removeElement(testOne, 3));
        System.out.println(removeElement(testTwo, 2));

    }

}
