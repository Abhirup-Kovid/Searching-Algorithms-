public class FibonacciSearch {

    public static int fibonacciSearch(int[] arr, int x) {
        int n = arr.length;

        // Initialize Fibonacci numbers
        int fibMm2 = 0; // (m-2)th Fibonacci
        int fibMm1 = 1; // (m-1)th Fibonacci
        int fibM = fibMm1 + fibMm2; // mth Fibonacci

        // Find the smallest Fibonacci number >= n
        while (fibM < n) {
            fibMm2 = fibMm1;
            fibMm1 = fibM;
            fibM = fibMm1 + fibMm2;
        }

        int offset = -1;

        while (fibM > 1) {

            int i = Math.min(offset + fibMm2, n - 1);

            if (arr[i] < x) {
                fibM = fibMm1;
                fibMm1 = fibMm2;
                fibMm2 = fibM - fibMm1;
                offset = i;
            }

            else if (arr[i] > x) {
                fibM = fibMm2;
                fibMm1 = fibMm1 - fibMm2;
                fibMm2 = fibM - fibMm1;
            }

            else {
                return i;
            }
        }

        // Check the last possible element
        if (fibMm1 == 1 && offset + 1 < n && arr[offset + 1] == x) {
            return offset + 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        int x = 50;

        int result = fibonacciSearch(arr, x);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}