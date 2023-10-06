package Leetcodeproblems;

public class BinarySearch {
    public static void main(String args[]){
        int num[] = {-1 ,0 ,3,5,9,12};
        int target = 9;
        System.out.println(binarySearch(num , target));
    }
    public static int binarySearch(int num[] , int target){
        int l = 0 ;
        int r = num.length-1;
       while(l <= r){

            int mid = l +r/2;

            if(num[mid]==target){
                return mid;
            }
            else if (target > num[mid]) {
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return -1;
    }
}
