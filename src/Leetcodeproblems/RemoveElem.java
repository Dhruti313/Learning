package Leetcodeproblems;

public class RemoveElem {
    public static void main(String  args[]){
        int nums[] = {2,3,3,2};
        int target = 2;
        int count = 0;
       System.out.println(removeElement(nums , target , count));
//       for(int  i = 0 ; i<nums.length ; i++){
//           System.out.print(nums[i]+" ");
//       }

    }
    public static int removeElement(int nums[] , int target , int count){
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]!= target){
                nums[count++] = nums[i];
            }

        }
       return count;
    }
}
