// Author: Lionel T Lynch
// FileName: QuickSort.java
/* Description: This program will include the Quick Sort algorithm, detailing the Time complexity, Space Complexity,
and outline use cases.

- Time Complexity: Best case of O(nLOGn) | Worst Case of O(n^2)

- Space Complexity: O(n)

- Use case: Works with large data sets that have been partially been sorted.

- Visualization:
    Key: LP = leftPointer = (), RP = rightPinter = {}, pivot = [[]].

    - Increment and decrement logic : swap condition = while (leftPointer > array[pivotLocation]) and while (rightPointer < array[pivotLocation])
    - Create two pointers vars to work its way through the list until two swappable nums are located
    - [5,8,12,7,9,5,3,11,1,2,14] -> choose a pivot from the dataset at random -> Pivot = 3
    - Compare each LP to RP using pseudocode
        - [(5),8,12,7,9,5,[3],11,1,2,{14}] -> [5,(8),12,7,9,5,[3],11,1,{2},14] -> SWAP [5,(2),12,7,9,5,[[3]],11,1,{8},14] etc...
        - Once we have are list divided EX: [5,2,8,7,1,5,[[3]],11,9,12,14]
        - Call quick sort recursively on the left portion of the list by setting
          the lowIndex parameter to lowIndex and the highIndex to leftPointer - 1
        - Call quick sort recursively on the right portion of the list by setting
          the lowIndex parameter to LP + 1 and the highIndex parameter to highIndex.
        - Include a base Case to terminate loop when we get to an array with one item inside.*/

package com.lioneltlynch.algorithms.algorithms;
import java.util.Random;

public class QuickSort {
    // Overloaded method that accepts an array as input
    public int[] quickSort(int[] array){
        quickSort(array, 0, array.length - 1);
        return array;
    }

    public void quickSort(int[] array, int lowBound, int highBound) {
        // Base case
        if(lowBound >= highBound){
            return;
        }

        // Random pivot
        int pivotIndex = new Random().nextInt(highBound - lowBound) + lowBound;

        // Partitions the array, and captures the leftPointer for recursive use
        int leftPointer = partition(array, lowBound, highBound, pivotIndex);

        quickSort(array, lowBound, leftPointer); // Left half of array
        quickSort(array,leftPointer + 1, highBound); // Right half if array
    }

    private int partition(int[] array, int lowBound, int highBound, int pivotIndex) {
        int leftPointer = lowBound;
        int rightPointer = highBound;
        int pivot = array[pivotIndex];

        while (leftPointer < rightPointer) {
            while (array[leftPointer] < pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] > pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(array,leftPointer,rightPointer);
        }
        return leftPointer;
    }

    private void swap(int[] array, int index1, int index2) {
        // Catches exceptions if indices are out of bounds
        if(index1 < 0 || index1 >= array.length){
            throw new ArrayIndexOutOfBoundsException("Index 1 is out of bounds");
        }
        if(index2 < 0 || index2 >= array.length){
            throw new ArrayIndexOutOfBoundsException("Index 2 is out of bounds");
        }
        // Swap
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}