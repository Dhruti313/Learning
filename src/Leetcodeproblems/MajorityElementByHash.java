package Leetcodeproblems;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementByHash {
    public static void main(String args[]){
        int arr[] = {3,9,4};
        int n = arr.length;
        System.out.println(majoritycount(arr , n));
    }
    public static int majoritycount(int arr[] , int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int key = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            key = e.getKey();
            int value = e.getValue();
            if (value > n / 2) {
                System.out.println(key);
            }
        }
        return key;
    }
}
