package PracticeForJava;

import com.sun.jdi.InconsistentDebugInfoException;

public class TwoSumWithYesOrNo {
    public static void main(String args[]){
        int arr[] = {1, -2, 1, 0, 5};
        int target = 0;

        if(TwoSum( arr , target)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static Boolean TwoSum(int arr[] , int target){
        for(int i = 0 ; i<arr.length-1 ; i++){
            for(int j = i+1 ; j <arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }

            }
        }
        return false;
    }
}
