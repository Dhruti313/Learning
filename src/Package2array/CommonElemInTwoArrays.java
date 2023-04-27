package Package2array;

import java.util.HashMap;

public class CommonElemInTwoArrays {
    public static void main(String args[]){
        int arr[] = {1,2,3,5,7,9};
        int arr2[] = {1,4,6,7,9,10};
        commonElement(arr,arr2);

    }
    public static void commonElement(int arr[] , int arr2[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                map.remove(arr2[i]);
                System.out.print(arr2[i]+" ");
            }
        }

    }
}
