public class TernarySearch {

    public static int ternarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;

            if (arr[mid1] == target)
                return mid1;

            if (arr[mid2] == target)
                return mid2;

            if (target < arr[mid1]) {
                high = mid1 - 1;
            }
            else if (target > arr[mid2]) {
                low = mid2 + 1;
            }
            else {
                low = mid1 + 1;
                high = mid2 - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60,70,80,90};

        int target = 50;

        int index = ternarySearch(arr, target);

        if(index != -1)
            System.out.println("Found at index: " + index);
        else
            System.out.println("Not Found");
    }
}