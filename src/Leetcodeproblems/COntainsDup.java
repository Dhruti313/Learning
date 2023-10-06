package Leetcodeproblems;

import java.util.HashMap;

public class COntainsDup {
    public static  boolean duplicate(int k , int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[i] == arr[j] &&  Math.abs(i-j)<=k){
                    return true;
                }
            }
        }
        return  false;

    }
    public static boolean hash(int arr[] , int k){
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i<arr.length ; i++){
            if(map.containsKey(arr[i]) && Math.abs(map.get(arr[i])-i) <=k){
                return true;
            }
            map.put(arr[i] , i);
        }
return  false;
    }
    public static void main(String arsg[]){
        int k = 2;
        int arr[] = {1,2 , 3 , 1 ,2 , 3};
//        System.out.println(duplicate(k , arr));
        System.out.println(hash(arr , k));
    }
}
