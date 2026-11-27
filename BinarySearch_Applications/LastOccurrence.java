package BinarySearch_Applications;

public class LastOccurrence {
    public static int lastOccurrence(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid] == target){
                ans = mid;
                low = mid+1;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,2,3,4};
        int target = 2;

        int LO = lastOccurrence(arr, target);
        int FO = FirstOccurence.firstOccurrence(arr, target); 
        
        System.out.println("The first Occurrence of "+target+" is: "+FO);
        System.out.println("The last Occurrence of "+target+" is: "+LO);
    }
}
