package com.flipkart.m3.sortingAlgorithm;

public class SelectionSort {
    /*
     * iterate through the loop from i=0 to n
     *   iterate through the inner loop from j=i to n-1 and find the min value
     *   swap the min value with the arr[i].
     * */
    public static int[] sort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[minIdx] > nums[j]) {
                    minIdx = j;
                }
            }
            Util.swap(nums, i, minIdx);
        }
        return nums;
    }
}
