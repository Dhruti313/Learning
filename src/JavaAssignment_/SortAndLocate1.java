package JavaAssignment_;

import java.util.Scanner;

public class SortAndLocate1 {

    public static int sort(int arr[], int target, int d , int count){

        int l = 0 ;
        int r = d-1;
        while(l<=r){

            int mid = (l + r)/2;
            count++;
            if(arr[mid] == target){
                return mid;
            } else if (target> arr[mid]) {
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        System.out.println(count);
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers you want to add");
        int d = sc.nextInt();
        int arr[] = new int[d];

        System.out.println("enter the value");
        for(int i = 0 ; i<d ; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        System.out.println("which element you want to find-");
        int target = sc.nextInt();
        System.out.println(sort(arr , target,d , count));


    }
}
