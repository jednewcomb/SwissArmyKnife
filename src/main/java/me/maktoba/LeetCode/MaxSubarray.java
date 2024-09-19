package me.maktoba.LeetCode;

public class MaxSubarray {

    private static int maxSubArray(int[] nums) {
        //we keep track of our current sum and a maximum sub
        //in ONE pass through our array, giving us time complex O(n)

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);

            if (currSum <= 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));//6

        //this question is actually annoying and stupid. it makes no sense. if all values
        //are positive, it just returns the whole array, even though the sub array including
        //elements 0-8 would be smaller than the sub array of elements 1-9
        System.out.println(maxSubArray(new int[] {10, 1, 4, 7, 9, 3, 6, 2, 5, 8}));//55


    }

}
