import java.lang.reflect.Array;

/*

 Whats a Bubble Sort:
 - Bubble sort compares neighboring indexes to eachother then decides 
   based on the numbers whether to swap the values or not.

 Whats the Time Complexity of a bubble sort: 
 - O(n2) due to comprmising a Nested For loop

 Whats the Space Complexity:
 - O(1) 


 When would I use this algorithm:
 - Bubble sort is useful when dealing with SMALL unordered data sets that are nearly sorted.

 */
import java.util.Arrays;


public class Bubble_Sort {
    public static void main(String[] args){
        int[] array = {1,8,7,6,5,4,3,2,9};
        bubble_sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubble_sort(int[] arr){
        // While loop to ensure that the loop repeats until there are no more swaps
        boolean swap_happened = true; // *Loop ON
        while(swap_happened){
            // Loop through the list of items in the length of the array
            for(int i = 0; i < arr.length -1; i++){
                // If we don't enter the the condtional swap statement then the while loop terminates 
                swap_happened = false;
                
                // Comapre the items neighboring eachother
                if(arr[i] > arr[i + 1]){
                    swap_happened = true; // Think of this like a light switch, This turns the loop ON for another run
                    int temp = arr[i]; // Captures the value of the the index before it gets over written 
                    // SWAP
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}