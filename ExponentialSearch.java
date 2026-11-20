public class ExponentialSearch {
    static int binarySearch(int[] arr, int left, int right, int target){

        while(left<=right){

            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] < target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }    

        static int exponentialSearch(int [] arr, int target){
            
            int n = arr.length;

            if(arr[0] == target)
                return 0;

            int i = 1;

            while(i < n  &&  arr[i]<=target){

                i=i*2;
            }
            return binarySearch(
                                arr,
                                i/2, 
                                Math.min(i,n-1), 
                                target);

        }
        public static void main(String[] args) {
            int [] arr ={2,4,6,8,10,12,14,16,18,20,22,24};

            int target=22;

            int result = exponentialSearch(arr, target);

            System.out.println("Found at Index: "+result);
        }
}
