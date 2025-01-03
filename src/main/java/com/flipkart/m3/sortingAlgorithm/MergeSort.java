package com.flipkart.m3.sortingAlgorithm;

public class MergeSort {
    public static void sort(int[] arr) {
        sort(arr, 0, arr.length-1);
    }

    public static void sort(int[] arr, int l, int h) {
        if (l < h) {
            int mid = l + (h - l) / 2;
            sort(arr, l, mid);
            sort(arr, mid + 1, h);
            merge(arr, l, mid, h);
        }
    }

    public static void merge(int[] arr, int l, int mid, int h) {
        System.out.println("l is" + l + ", mid is " + mid + " and h is " + h);
        int[] leftArray = new int[mid - l + 1];
        int[] rightArray = new int[h - mid];
        for (int i = l; i <= mid; i++) {
            leftArray[i - l] = arr[i];
        }

        for (int j = mid + 1; j <= h; j++) {
            rightArray[j - mid - 1] = arr[j];
        }

        int i = 0;
        int j = 0;
        int k = l;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }
        while (i < leftArray.length) {
            arr[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            arr[k++] = rightArray[j++];
        }
    }
}
