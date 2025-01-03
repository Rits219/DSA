package com.flipkart.m3.sortingAlgorithm;

public class InsertionSort {
    /*
    * iterate from i=2 to n.
    *   store the value of arr[i] in key.
    *   iterate through the inner loop from j=i-1 till we find the smaller element and place all the bigger element to the one position right.
    *   at the stopped index,place the arr[i]
    * */
    public static void sort(int[] nums){
        int n=nums.length;
        for(int i=1;i<n;i++){
            int key=nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }
    }
}
