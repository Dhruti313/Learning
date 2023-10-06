package ExcelSheetProblems;

import java.awt.*;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SIngleNumber {
    public static void main(String args[]){
        int nums[]= {4,1,2,1,2};
        sngle(nums);
    }
    public static int sngle(int nums[]){
        int d =0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i])+1);
            }
            else{
                map.put(nums[i] , 1);
            }
        }
        for(Map.Entry<Integer , Integer>e : map.entrySet()){
            if(e.getValue() ==1){
                d = e.getKey();
                System.out.println(d);
            }
        }
        return d;
    }
}
