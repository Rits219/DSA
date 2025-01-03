package com.flipkart.m3.sortingAlgorithm;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        int[] nums = {2, 1, 6, 10, 4, 1, 3, 9, 7};
        HeapSort.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
