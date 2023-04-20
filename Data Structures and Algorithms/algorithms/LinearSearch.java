// Author: Lionel Lynch
// File Name: LinearSearch.java
/* Description:This program will include the Linear Search algorithm, detailing the Time complexity, Space Complexity,
and outline use cases.


         Time Complexity:
         - Linear Search Algorithm has a time complexity of Big O(n) which means that
         as N grows the time it takes to for the potential time it takes to run th search increase,
         because in the case the item were searching for happens to be in the last index, we would
         have to iterate through the entire list of n items.

         Space Complexity:
         - Linear Search Algorithm has a space complexity if O(1) meaning its constant

      Use cases:
        - If you have a list the is large a Linear Search Algorithm wouldn't be the best option,
        as the Time Complexity of O(n) is best for UNSORTED and SHORT list. Taking the Time to sort
        a list would be a better option for a larger data set that needs to be search
*/

package com.lioneltlynch.algorithms.algorithms;

public class LinearSearch {

    public int linearSearch(int key, int[] arr){
        for(int i = 0; i < arr.length; i++){
            // Base-0 indexing
            int index = i ;
            // Check for key
            if(key == arr[i]){
                System.out.println("Found: " + key + " " + "at index " + index);
            }
        }
        // When key is not found
        System.out.println("Key not Found");
        return key;
    }
}
