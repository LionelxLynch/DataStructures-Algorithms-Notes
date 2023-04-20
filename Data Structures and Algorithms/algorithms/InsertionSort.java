// Author: Lionel T Lynch
// File Name: Main.java

/* Description:
- Insertion sort = after comparing elements to the left,
- shift elements to the right to make room to insert a value
- Quadratic time O(n^2)
- small data set = decent
- large data set = BAD
- Fewer steps than Bubble sort
- Best case is O(n) compared to Selection sort O(n^2)
*/


package com.lioneltlynch.algorithms.algorithms;

import java.util.ArrayList;


public class InsertionSort {
    ArrayList<Integer> arr = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
        arr.add((int) (Math.random() * 100)); // generates a random number between 0 and 99
    }

    insertionSort(arr); // Sorts list
    System.out.println(secondLargest(arr)); // prints second-largest number

    System.out.println("Array: " + arr); // print list to validate


    private String secondLargest(ArrayList<Integer> array){
        return "Second Largest: " + array.get(1);
    }

    private void insertionSort(ArrayList<Integer> numList) {
        for (int i = 1; i < numList.size(); i++) {
            int curr = numList.get(i);
            int indexJ = i - 1;

            while (indexJ >= 0 && numList.get(indexJ) < curr) {
                numList.set(indexJ + 1, numList.get(indexJ));
                indexJ--;
            }
            numList.set(indexJ + 1, curr);
        }
    }
}