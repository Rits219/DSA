package com.flipkart.m3.sortingAlgorithm;

import static com.flipkart.m3.sortingAlgorithm.Util.swap;

public class BubbleSort {
    /*
     * iterate through the outer loop from i=0 to n-1
     *   iterate through the loop from j=0 to n-i-1
     *   if arr[j]>arr[j+1] then swap the values.
     * */
    public static int[] sort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }
        return nums;
    }
}
