package Leetcodeproblems;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ContainsDuplicate {
    public static void main(String  args[]){
        int nums[] = {1,2,3};
       System.out.println(duplicate(nums));
    }
    public static boolean duplicate(int nums[]){

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i<nums.length ; i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            else{
                map.put(nums[i] , 1);
            }
        }
       for(Map.Entry<Integer , Integer> res : map.entrySet()) {
            System.out.println(res.getKey() + "-->" +res.getValue());
        }
        return false;
    }
}
