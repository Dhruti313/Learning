package Leetcodeproblems;

import java.util.Arrays;

public class Minimumumber_of_Arrows_to_Burst_Balloons {
    public static void main(String args[]){
        int arr[][] = {{1 , 2} , {3 ,4} , {5 , 6} , {7 ,8}};
       System.out.println(findBallons(arr));
    }
    public static int findBallons(int arr[][]){
      int arrow = 1;
      if (arr.length == 0) return 0;
        Arrays.sort(arr,(a, b) -> Integer.compare(a[1] , b[1]));
        int end = arr[0][1];
        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i][0] > end){
                arrow++;
                end = arr[i][1];
            }
        }
return arrow;
    }
}
