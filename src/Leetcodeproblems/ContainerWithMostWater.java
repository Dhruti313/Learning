package Leetcodeproblems;

public class ContainerWithMostWater {
    public static void main(String args[]){
        int arr[] = {1 , 1};
        System.out.println(container(arr));
    }
    public static int container(int[] arr){
        int l = 0 ;
        int r = arr.length - 1;
        int max = 0;
        while (l<r){
            int lh = arr[l];
            int rh = arr[r];
            int min = Math.min(lh , rh);
            int length = r-l;
            int currentArea = min * length;
            max = Math.max(max , currentArea);
            if(lh < rh){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}
