package MyLearning;

import java.util.Arrays;

public class Secondlargest {
    public static void main(String args[]){
        int arr[]= {10,40,23,56,1};



        int temp ;


        for(int i = 0 ; i< arr.length ; i++){
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[i]< arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;

                }
            }
        }
         for(int i = 0 ; i < arr.length ; i++){
             System.out.println( +arr[i] +" ");
         }
        System.out.println("Largest element is "  +arr[0]);
        System.out.println("Second largest element is "+arr[1]);
    }
}
