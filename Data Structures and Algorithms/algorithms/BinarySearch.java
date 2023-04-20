package com.lioneltlynch.algorithms.algorithms;

public class BinarySearch {
    public int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;


        if (arr[mid] == key) {
            return arr[mid];
        } else if (arr[mid] < key) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }

        // Sentinel Value
        return -1;
    }
}
