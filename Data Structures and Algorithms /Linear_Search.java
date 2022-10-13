/* 
        Linear Search Algorithm Overview: 

         What is Time Complexity or Big O:
         - Time complexity is the time it takes for an algorithm to take place, or
         the worst case scernario for it will take for an algorithm to run 
        

         Time Complexity of a Linear Search Algorithm:
         - Linear Search Algorithm has a time complexity of Big O(n) which means that 
         as N grows the time it takes to for the potential time it takes to run th search increase,
         beacuse in the case the item were searching for happens to be in the last index, we would
         have to iterate through the entire list of n items.

         What is the Space Complexity of a Linear Search Algorithm:
         - Linear Search Algorithm has a space complexity if O(1) meaning its constant

        When would you use a Linear Search Algorithm:
        - If you have a list the is large a Linear Search Algorithm wouldn't be the best option, 
        as the Time Complexity of O(n) is best for UNSORTED and SHORT list. Taking the Time to sort 
        a list would be a better option for a larger data set that needs to be search 
*/


public class Linear_Search {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int num = 88;

        search(num, array);
    }

    private static void search(int key, int[] arr){
        for(int i = 0; i < arr.length; i++){ // For loop to iterate through the array 
            // Condition on if the Key is found 
            if (key == arr[i]){ 
                System.out.println("Key: " + key + " ," + "Found at index: " + arr[i-1]);
                break;
                }
            // Condition on if the key is not found 
            else if(i+1 == arr.length){ /* The "i + 1" is to ensure that the the i/count ends up adding up to the total of the list in question, 
                                        as i is prevented from equaling the length of the Array as because the condtion of the loop being i < arr.length
                                        */
                System.out.println("Item not found");
                }
            }
        }
    }

    /*

     



     */