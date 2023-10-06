package Leetcodeproblems;

public class Min_size_subarray {
    public static  void main(String args[]){
        int nums[] = {1,1,1,1,1,1,1,1};
        int target = 11;
        System.out.println(minSize(nums , target));
    }
    public static int minSize(int[] nums, int target){
        int sum = 0;
        int left =0;
        int right;
        int shortest =Integer.MAX_VALUE;

        for(right = 0; right <nums.length ; right++){
            sum = sum + nums[right];
            if(sum >= target){
                while(sum>=target){
                    sum = sum-nums[left];
                    left++;
                }
                shortest= Math.min(shortest , right-left+2);
            }
        }
        return shortest==Integer.MAX_VALUE ? 0 : shortest;
    }
}
