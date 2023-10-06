package PracticeForJava;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {
    public static void main(String args[]){
        int arr[] = {2,2,2,2,5};
        duplicate(arr);
    }
    public static void duplicate(int arr[]){
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i<arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i] )+1);
            }
            else{
                map.put(arr[i] , 1);
            }
        }
        for(Map.Entry<Integer , Integer> e : map.entrySet()){
            System.out.println(e.getKey());
        }
    }

}

