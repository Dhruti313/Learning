package MyLearning;

import java.util.Arrays;
import java.util.Scanner;

public class secdlargest {
    public static void main(String args[]){
        int arr[] = {20,45,10,30,6};


        Arrays.sort(arr);
        System.out.println("Elements in ascending order are :");

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);


        }
        System.out.println("Highest element is:" + arr[arr.length-1]);
        System.out.println("Second highest element is :" +arr[arr.length-2]);


    }
}
