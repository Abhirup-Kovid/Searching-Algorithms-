package BinarySearch_Applications;

public class UpperBound {
    public static int upperBound(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid]>target){
                ans = mid;
                high = mid-1;
            }

            else
                low = mid + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,2,2,5,7};
        int target = 5;
        int res = upperBound(arr, target);

        System.out.println("The upper bound is: "+res);
        System.out.println("The lower bound is: "+LowerBound.lowerBound(arr, target));
    }
}
