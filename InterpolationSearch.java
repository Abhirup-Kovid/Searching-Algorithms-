public class InterpolationSearch {

    public static int interpolationSearch(int target, int[] arr ){
        
        int left = 0;
        int right = arr.length-1;

        while(left<=right && target>=arr[left] && target<=arr[right]){

            if(left==right){
                if(arr[left]==target){
                    return left;
                }
                return -1;
            }

            int pos = left + (((target-arr[left]) * (right-left)) / (arr[right] - arr[left]));

            if(arr[pos] == target){
                return pos;
            }

            if(arr[pos] < target){
                left=pos+1;
            }
            else{
                right=pos-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        
        int[] arr = {10,20,30,40,50,60,70,80,90};

        int target=80;

        int result = interpolationSearch(target, arr);

        System.out.println("The target found at index: "+result);

    }
}
