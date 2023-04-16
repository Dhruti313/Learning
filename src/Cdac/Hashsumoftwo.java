package Cdac;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hashsumoftwo {
    public static void main(String args[]){
        int target = 5;
        int arr[] = {7 ,2, 3};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]) ) {
                System.out.println(map.get(arr[i])+ " , "+ arr[i] );
            }
            else{
                map.put(target-arr[i],arr[i]);
            }

            }

    }
}
