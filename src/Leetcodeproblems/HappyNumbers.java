package Leetcodeproblems;

import java.util.HashSet;

public class HappyNumbers {
    public static void main(String args[]){
        int n =82;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n){
        HashSet<Integer> set = new HashSet<>();
        while(true){
            int sum = 0;
            while(n!=0){
                int digit = n%10;
                sum += digit * digit;
                n/=10;
            }
            if(sum == 1){
                return true;
            }
            else{
                n = sum;
            }
            if(set.contains(n)){
                return false;
            }
            set.add(n);
        }
    }
}
