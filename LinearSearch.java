/*
    #####################  ALGORITHM   #################

LinearSearch(A, n, ITEM)
Input: Array A of size n, and ITEM to be searched
Output: Position of ITEM if found, else -1

Step 1: Set i = 0
Step 2: Repeat while i < n
          If A[i] == ITEM
              Return i   // ITEM found at position i
          Else
              i = i + 1
Step 3: If loop ends without finding ITEM
          Return -1      // ITEM not found


###############   Time Complexity  ################

Time Complexity:

Best Case: 
𝑂(1) → element found at the first position.

Worst Case: 
𝑂(𝑛) → element not found or found at the last position.

Average Case: 
𝑂(𝑛).
 */


public class LinearSearch {
    public static int linearSearch(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i; // Found at index i
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 50};
        int item = 30;

        int result = linearSearch(arr, item);
        if (result != -1) {
            System.out.println("Item found at index: " + result);
        } else {
            System.out.println("Item not found");
        }
    }
}
