package Leetcodeproblems;

import java.util.concurrent.atomic.AtomicReference;

public class NextGreatestElem {
    public static void main(String args[]){
        int arr[] = {4 , 5 , 2 , 25};
        greatestElem(arr);
    }
    public static int greatestElem(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while(i<j){
            if(arr[i]<arr[j]){
                System.out.println(arr[j]);
                i++;j++;
            }
        }
        return -1;
    }
}
