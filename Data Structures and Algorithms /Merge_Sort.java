import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args){
        int[] list = {11,10,9,8,7,6,5,4,3,2,1};
        merge_sort(list);
        System.out.println(Arrays.toString(list));
    }

    public static void merge_sort(int[] array){
        int array_length = array.length; // Create a var for the size of the array
        // Base Case: To account for the instance's when the sort gets down to single items
        if (array_length < 2){
            return;
        }

        // Next, we want to split the array into its respective left and right sides after defining the middle
        int middle_index = array_length / 2;
        int[] left_half = new int[middle_index];
        int[] right_half = new int[array_length - middle_index]; // What ever is left over 


        // Fill the left half of the array with the data from the array until we reach the middle
        for (int i = 0; i < middle_index; i++){
            left_half[i] = array[i];
        }
        // Fill the right half of the array with the data from the array until we reach the end
        for(int i = middle_index; i < array_length; i++){
            right_half[i - middle_index] = array[i]; //  [x,x,x,x,i - middle_index,x,x,x,x,]
        }

        merge_sort(left_half);// Recursivly split the left side of the array
        merge_sort(right_half);// Recursivly split the right side of the array
        merge(left_half, right_half, array);// Merge function place holder
    }

    private static void merge(int[]left_half, int[]right_half, int[] arr){
        int left_size = left_half.length; // Convient var for the size of the left side 
        int right_size = right_half.length; // Convient var for the size of the right side

        int i = 0, j = 0, k = 0; // Var for left items, Var for right items, Var for array;

        // While the left half and right half have items run this script
        while (i < left_size && j < right_size){
            // Compare the first item in the left half to ALL the items to the right half 
            if (left_half[i] <= right_half[j]){
                arr[k] = left_half[i]; // Place items in the main array
                i++; // Increment 
            }
            // If the right half has items in it add items in the main array
            else{
                arr[k] = right_half[j]; 
                j++;
            }
            k++;
        }
        while (i < left_size){
            arr[k] = left_half[i];
            i++;
            k++;
        }
        while (i < right_size){
            arr[k] = right_half[j];
            j++;
            k++;
        }
    }
}