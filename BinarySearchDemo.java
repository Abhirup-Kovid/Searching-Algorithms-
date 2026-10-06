/*
 #####################  ALGORITHM   #################

Algorithm (Iterative)   
BinarySearch(A, n, ITEM)
Input: Sorted array A of size n, and ITEM to be searched
Output: Position of ITEM if found, else -1

Step 1: Set low = 0, high = n - 1
Step 2: Repeat while low <= high
          mid = (low + high) / 2
          If A[mid] == ITEM
              Return mid   // ITEM found
          Else If ITEM < A[mid]
              high = mid - 1   // Search left half
          Else
              low = mid + 1    // Search right half
Step 3: If loop ends without finding ITEM
          Return -1



Algorithm (Recursive)
BinarySearchRecursive(A, low, high, ITEM)
Input: Sorted array A, range [low..high], and ITEM
Output: Position of ITEM if found, else -1

Step 1: If low > high
          Return -1   // ITEM not found
Step 2: mid = (low + high) / 2
Step 3: If A[mid] == ITEM
          Return mid
Step 4: Else If ITEM < A[mid]
          Return BinarySearchRecursive(A, low, mid - 1, ITEM)
Step 5: Else
          Return BinarySearchRecursive(A, mid + 1, high, ITEM)





###############   Time Complexity  ################

Time Complexity:

Best Case: 
𝑂(1) → element found at the middle.

Worst Case: 
𝑂(log⁡𝑛).

Average Case: 
𝑂(log⁡𝑛).

*/



public class BinarySearchDemo {

    // Iterative Binary Search
    public static int binarySearchIterative(int[] arr, int item) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == item) {
                return mid; // Found
            } else if (item < arr[mid]) {
                high = mid - 1; // Search left half
            } else {
                low = mid + 1; // Search right half
            }
        }
        return -1; // Not found
    }

    // Recursive Binary Search
    public static int binarySearchRecursive(int[] arr, int low, int high, int item) {
        if (low > high) {
            return -1; // Not found
        }

        int mid = (low + high) / 2;

        if (arr[mid] == item) {
            return mid; // Found
        } else if (item < arr[mid]) {
            return binarySearchRecursive(arr, low, mid - 1, item);
        } else {
            return binarySearchRecursive(arr, mid + 1, high, item);
        }
    }

    // Main method to test both
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Must be sorted
        int item = 40;

        // Test Iterative
        int resultIterative = binarySearchIterative(arr, item);
        if (resultIterative != -1) {
            System.out.println("Iterative: Item found at index " + resultIterative);
        } else {
            System.out.println("Iterative: Item not found");
        }

        // Test Recursive
        int resultRecursive = binarySearchRecursive(arr, 0, arr.length - 1, item);
        if (resultRecursive != -1) {
            System.out.println("Recursive: Item found at index " + resultRecursive);
        } else {
            System.out.println("Recursive: Item not found");
        }
    }
}
