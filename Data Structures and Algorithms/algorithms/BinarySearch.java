package com.lioneltlynch.algorithms.algorithms;

public class BinarySearch {
    // Iterative approach 
    public static int binarySearch(int[] arr, int key) {
    int low = 0;
    int high = arr.length - 1;
        
    while (low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid] == key) {
            return mid;
        } 
        else if (arr[mid] < key) {
            low = mid + 1;
        } 
        else {
            high = mid - 1;
        }
    }
    // The key is not in the array
    return -1;
}
    
    // Overloaded recursive function 
    public static int binarySearchRecursive(int[] arr, int key) {
        return binarySearchRecursive(arr, key, 0, arr.length - 1);
}

    // Recursive approach 
    public static int binarySearchRecursive(int[] arr, int key, int low, int high) {
        // Base case 
        if (low > high) {
            // The key is not in the array
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == key) {
            // Found the key at index mid
            return mid;
        } 
        else if (arr[mid] < key) {
            // Key is in the right half of the array
            return binarySearchRecursive(arr, key, mid + 1, high);
        } 
        else {
            // Key is in the left half of the array
            return binarySearchRecursive(arr, key, low, mid - 1);
        }
    }
}
