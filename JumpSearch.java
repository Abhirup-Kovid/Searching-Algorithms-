/*
    #####################  ALGORITHM   #################

JumpSearch(A, n, ITEM)
Input: Sorted array A of size n, and ITEM to be searched
Output: Position of ITEM if found, else -1

Step 1: Set step = √n
Step 2: Set prev = 0
Step 3: While A[min(step, n)-1] < ITEM
          prev = step
          step = step + √n
          If prev >= n → Return -1
Step 4: Linear search from A[prev] to A[min(step, n)-1]
          If A[i] == ITEM → Return i
Step 5: If not found → Return -1



###############   Time Complexity  ################

Time Complexity:

Best Case: 
𝑂(1).

Worst Case: 
𝑂(𝑛).

Average Case: 
𝑂(𝑛).
 */







public class JumpSearch {

    public static int jumpSearch(int[] arr, int item) {
        int n = arr.length;
        int step = (int)Math.floor(Math.sqrt(n));
        int prev = 0;

        // Jump ahead until we find a block
        while (arr[Math.min(step, n) - 1] < item) {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1; // Not found
            }
        }

        // Linear search in the block
        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == item) {
                return i; // Found
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80}; // Must be sorted
        int item = 70;

        int result = jumpSearch(arr, item);
        if (result != -1) {
            System.out.println("Item found at index: " + result);
        } else {
            System.out.println("Item not found");
        }
    }
}
