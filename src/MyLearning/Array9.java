package MyLearning;

import java.util.Arrays;
import java.util.Scanner;

public class Array9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Array Size");

        int n = scanner.nextInt();
        int arr[] =  new int[n];

        System.out.println("Enter the elements of Array");


        for( int i = 0 ; i<n ; i++){
            arr[i] = scanner.nextInt();

        }
        System.out.println("Array elemnts are :");

        for( int j = 0 ; j<n ; j++){
            System.out.println(arr[j]);
        }
//        System.out.println(Arrays.stream(arr).min());
    }
}
