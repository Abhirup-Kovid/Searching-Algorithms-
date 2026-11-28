package BinarySearch_Applications;

public class CountOccurences {
    public static int countOccurrences(int[] arr, int target){
        int FO = FirstOccurence.firstOccurrence(arr, target);

        if(FO == -1){
            return 0;
        }

        int LO = LastOccurrence.lastOccurrence(arr, target);

        int count = LO - FO + 1;

        return count;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,2,2,2,2,3};
        int target = 2;

        int res = countOccurrences(arr, target);

        System.out.println("The number of times the target: "+target+ " appears is: "+res);
    }
}
