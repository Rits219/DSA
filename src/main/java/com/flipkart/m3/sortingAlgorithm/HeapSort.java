package com.flipkart.m3.sortingAlgorithm;

import java.util.Arrays;

public class HeapSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = n - 1; i > 0; i--) {
            Util.swap(arr, i, 0);
            heapify(arr, i, 0);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void heapify(int[] arr, int size, int i) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest = i;
        if (l < size && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < size && arr[r] > arr[largest]) {
            largest = r;
        }

        if (largest != i) {
            Util.swap(arr, i, largest);
            heapify(arr, size, largest);
        }
    }
}
