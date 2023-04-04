package MyLearning;

import java.util.Scanner;

public class MinofArray {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the array");

        int n = 3;
        int arr[] = new int[n];

        for(int i = 0 ; i< n ; i++){
            arr[i] = scanner.nextInt();
        }
       System.out.println(" elements are :");

        for(int j = 0 ; j < n ; j++){
            System.out.println(arr[j]);

        }
        int max = 0;
        int min = 110;

        for(int i = 0 ; i <n ; i++){
            if(max < arr[i]){
                max = arr[i];

            }
            if (min >arr[i]) {
                min = arr[i];
            }
        }
        System.out.println( "max number is : " +max);
        System.out.println( "min number is : " +min);
    }
}
