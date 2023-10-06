package PracticeForJava;

import java.util.Scanner;

public class FIndSumOfNumbers {
    public static int arraySum(int[] arr){

        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<5 ; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0 ;
        for(int  i = 0 ; i<5 ; i++){
            sum = sum +arr[i];

        }
        return sum;
    }
    public static void main(String args[]){
        int arr[] = new int[5];
        System.out.println(arraySum(arr));
    }
}
