package Package2array;

import java.util.HashMap;

public class TwoSum {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int target = 5;

        HashMap<Integer , Integer>map = new HashMap<>();
        for(int i = 0 ; i<arr.length ; i++){
            if(map.containsKey(arr[i])){
                System.out.println(map.get(arr[i])+" "+ arr[i] );

            }
            else{
                map.put(target-arr[i] , arr[i]);

                }
            }
        }


    }

