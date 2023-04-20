// Author: Lionel T Lynch
// File Name: MergeSort.java
/* Description: This program will include the Merge Sort algorithm, detailing the Time complexity, Space Complexity,
and its outline use cases.

- Time Complexity: O(n Log n)

- Space Complexity: O(n)

- Use Cases: Large data sets, list with duplicates, linked list etc.....

- Visualization:
KEY: | = mid

Level 1
[10,9,8,7,6 | 5,4,3,2,1]
Left          Right

Level 2
[10,9,8 | 7,6]   [5,4,3 | 2,1]
Left      Right  Left   Right

Level 3
[10,9 | 8]     [7 | 6]    [5,4 | 3]     [2 | 1]
  Left Right  Left Right   Left Right  Left Right

Level 4
[10 | 9]   [8] [7] [6]   [5 | 4]    [3] [2] [1]
Left Right  Base Case   Left Right   Base Case

Base Level
[10] [9] [8] [7] [6]     [5] [4] [3] [2] [1]
Left                     Right

Next,

[10] [9] [8] [7] [6]     [5] [4] [3] [2] [1]
i++-------------->       j++--------------->
- Compare if left[i] < right[j] you place the Ith element into arr[k], else place the jth element into ar[k]
- In the case we how some number left over in the left or right side we place the remaining in arr[k]

Arr = [1,2,3,4,5,6,7,8,9,10]
       k++---------------->

*/

package com.lioneltlynch.algorithms.algorithms;

public class MergeSort {
    public int[] mergeSort(int[] array){
        // Base Case
        if(array.length < 2){
            return array;
        }
        // Middle of the array
       int midIndex = array.length / 2;

        // Create left and right half of the list
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[array.length - midIndex];

        // Populate the list
        for(int i = 0; i < midIndex; i++){
            leftHalf[i] =  array[i];
        }
        for(int i = midIndex; i < array.length; i++){
            rightHalf[i - midIndex] = array[i];
        }

        mergeSort(leftHalf); // Break down the left half
        mergeSort(rightHalf); // Break down the right half
        merge(array,leftHalf,rightHalf);

        return array;
    }

    private void merge(int[] array, int[] leftHalf, int[] rightHalf){
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < leftHalf.length && j < rightHalf.length){
            // If left side has smaller number
            if(leftHalf[i] < rightHalf[j]){
                array[k] = leftHalf[i];
                i++;
            }
            // If the right side has a smaller number
            else{
                array[k] = rightHalf[j];
                j++;
            }
            k++; // Increment array index after the comparison statements conclude
        }

        // If there are remaining numbers in the leftHalf
        while(i < leftHalf.length){
            array[k] = leftHalf[i];
            i++;
            k++;
        }
        // If there are remaining numbers in the rightHalf
        while(j < rightHalf.length){
            array[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
