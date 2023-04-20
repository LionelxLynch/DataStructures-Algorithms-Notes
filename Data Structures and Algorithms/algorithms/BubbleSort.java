// Author: Lionel T Lynch
// File Name: BubbleSort.java
/* Description: This program will include the Bubble Sort algorithm, detailing the Time complexity, Space Complexity,
and outline use cases.

- Time Complexity: O(n^2)
Reason: Nested for loop

- Space Complexity: O(1)

- Use case: Smaller Data sets, as the Time Complexity grows exponentially

- Visualization:
KEY: () = current Jth index, {} = current + 1 index, <-?-> = Comparison.

First Iteration: [(9)<-?->{8},7,6,5,4,3]
- In this step we compare 9 to 8. 9 > 8, so we bubble/swap 9 with 8.
- [{8},(9),7,6,5,4,3] etc..
 */


package com.lioneltlynch.algorithms.algorithms;

public class BubbleSort {
    public int[] bubbleSort(int[] numList){

        /*
        Loops through the length of the list - 1, because each iteration compares the two adjacent numbers.
        The last item in the list doesn't have an adjacent number to the right of it.

        The first FOR loop serves as a way to not include numbers that have already been sorted
        in each iteration. As a function of the bubble sort algorithm the numbers that are placed at
        the end of the list are sorted. So the i VAR can be used in the second FOR loop as a way to
        exclude sorted items from the list.
         */
        for (int i = 0; i < numList.length - 1; i++){
            // Nested For loop used to carry out the comparison operation. Each iteration excludes sorted numbers.
            for (int j = 0; j < numList.length - 1 - i; j++){
                // Compare the left number to its adjacent number, and swap them if the conditions apply.
                if (numList[j] > numList[j + 1]){
                    int temp =  numList[j]; // Captures the larger number to be swapped.
                    numList[j] = numList[j + 1]; // Changes the left number to the right number
                    numList[j + 1] = temp; // Changes the right number to the left number
                }
            }
        }
        return numList; // Return sorted list
    }
}
