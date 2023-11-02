package NishantCode;

public class MaximumSubArray {
    public static void main(String args[]){
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(subArray(arr));
    }
    public static int subArray(int[] arr){
       int max  = 0;
       int currMax = 0;
       for(int i = 0 ; i<arr.length ; i++){
           if(currMax < 0){
               currMax = 0;
           }
           currMax = currMax + arr[i];
           max = Math.max(currMax , max);
       }
        return max;
    }
}
