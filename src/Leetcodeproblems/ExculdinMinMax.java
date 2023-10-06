package Leetcodeproblems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ExculdinMinMax {
    public static  void main(String args[]){
        int salary [] = {4000 , 3000 , 1000 , 2000};
        System.out.println(average(salary));
    }
    public static double average(int salary[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0 ;

        for(int i = 0 ; i<salary.length ; i++){
            if(salary[i] < min){
                min = salary[i];
            }
            if(salary[i] > max){
                max = salary[i];
            }
            sum = sum +salary[i];
        }
        return  (sum - min - max)/(salary.length-2.00);
    }
}
