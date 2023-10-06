package PracticeForJava;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int target = 8;
        sum(arr , target);
    }
    public static void sum(int arr[] , int target){
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i<arr.length ;i++){

            if(map.containsKey(arr[i])){

                map.get(arr[i]);
                System.out.println(arr[i]+" ,"+map.get(arr[i]));

            }
            else{
                map.put(target-arr[i] , arr[i]);
            }
        }
//        for(Map.Entry<Integer , Integer> e : map.entrySet()){
//            System.out.println(e.getKey()+" "+e.getValue());
//        }
    }

}
