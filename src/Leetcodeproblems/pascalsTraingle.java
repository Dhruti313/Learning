package Leetcodeproblems;

import java.util.ArrayList;
import java.util.List;

public class pascalsTraingle {
    public static void main(String args[]){
        int n = 7;
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i <n ; i++){
            for(int j = 1 ; j<n-i ; j++){
                System.out.print(" ");
            }
             int number  = 1;
            for(int  k = 0 ; k<=i ; k++){
                System.out.print(number+" ");
                number = number * (i-k)/(k+1);
            }
            System.out.println();
        }
    }
}
