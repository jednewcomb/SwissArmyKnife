package me.maktoba.LeetCode;

import java.util.HashMap;

public class MajorityElement {

    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            //if map has the key, its been counted already
            if (map.containsKey(nums[i])) {

                map.put(nums[i], map.get(nums[i]) + 1);
                if (map.get(nums[i]) > (nums.length / 2)) {
                    return nums[i];
                }

            }
            else {
                map.put(nums[i], 1);
            }
        }
        return nums[0];
    }
}
