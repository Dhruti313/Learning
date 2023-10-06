package JavaAssignment_;

import java.util.Scanner;

public class SearchAndLocate_ {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element ");
        int d = sc.nextInt();

        int arr[]= new int[d];
        System.out.println("enter the elements ");
        for(int i = 0 ; i < d ; i++){
            arr[i]  = sc.nextInt();
        }
        int count = 0;
        for(int  i = 0 ; i <d ; i++){
            for (int j = 0 ; j<arr.length - i - 1 ; j++){
                if( arr[j] > arr[j+1]){
                    count++;
                    int previous = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =previous;

                }
            }
        }
        System.out.println(count);
        printArray(arr);
    }
    public static void printArray(int arr[])
    {
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}
