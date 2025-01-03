package com.flipkart.m3.sortingAlgorithm;

public class QuickSort {
    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int l, int h) {
        if (l < h) {
            int pivotIdx = partition(arr, l, h);
            sort(arr, l, pivotIdx - 1);
            sort(arr, pivotIdx + 1, h);
        }
    }

    public static int partition(int[] arr, int l, int h) {
        int pivotIdx = getPivot(l, h);
        int i = l - 1;
        for (int j = l; j <= h; j++) {
            if (j == pivotIdx) {
                continue;
            }

            if (arr[j] <= arr[pivotIdx]) {
                i++;
                Util.swap(arr, i, j);
            }
        }
        i++;
        Util.swap(arr, i, pivotIdx);
        return i;
    }

    public static int getPivot(int l, int h) {
        return h;
    }
}
