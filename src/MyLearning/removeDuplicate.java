package MyLearning;

import java.util.Scanner;

public class removeDuplicate {
    public static int duplicateNumbers(int [] nums){
        int j = 0;
        for(int i = 0 ; i < nums.length -1 ; i++) {
            if (nums[i] != nums[i + 1]) {

                nums[j] = nums[i + 1];
                j++;
            }
        }
        return  j;
    }
    public static void main(String args[]){
        int arr[] = {1,1,2,2,2,3,3,4,5};



        System.out.println("Duplicate count"+duplicateNumbers(arr));
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }

    }
}
