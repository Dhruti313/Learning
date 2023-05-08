package Leetcodeproblems;

import java.util.Arrays;

public class SortArrayAscending {
    public static void main(String args[]){
        int a [] = {1,4,-9,-3,34};

        for(int i = 0 ; i<a.length ; i++){
            for(int j = i+1 ; j<a.length ; j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]= a[j];
                    a[j] = temp;

                }
            }
        }
        for(int i =a.length-1; i>=0 ; i--){
            System.out.print(a[i]+" ");
        }
//        System.out.println();
//        Arrays.sort(a);
//        for(int i = 0 ; i<a.length ; i++){
//            System.out.print(a[i]+" ");
//        }


    }
}
