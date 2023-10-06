package Leetcodeproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
public static List<List<Integer>> threeSum(int nums[]){
    Arrays.sort(nums);
    List<List<Integer>> arr = new LinkedList<>();

    for(int i = 0 ; i <nums.length ; i++){
        if(i==0 || (nums[i] != nums[i-1])){
            int low = i+1;
            int high = nums.length-1;
            int sum = 0-nums[i];

            while(low <high){
                if(nums[low] + nums[high]==sum){
                    arr.add(Arrays.asList(nums[i] , nums[low] , nums[high]));
                    while(low <high && nums[low]== nums[low+1])
                        low++;
                    while(low <high && nums[high]== nums[high-1])
                        high--;
                } else if (nums[low] + nums[high] > sum) {
                    high--;
                }
                else{
                    low++;
                }
                low++; high--;
            }


        }
    }
    return arr;
}
public  static void main(String args[]){
    int nums[] = {1,-1,-1,0};
    List<List<Integer>> arr1 = threeSum(nums);
    System.out.println(arr1);
}

}

