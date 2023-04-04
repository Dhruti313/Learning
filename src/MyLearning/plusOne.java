package MyLearning;

import java.util.Arrays;

public class plusOne {
    public static int[] newArray(int[] digits){
        for(int i = digits.length - 1 ; i>=0 ; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int [] newNo = new int[digits.length+ 1];
        newNo[0] = 1;
        return newNo;
    }
    public static void main(String args[]){
        int digits [] = {9};
        String s = Arrays.toString(newArray(digits));
        System.out.println(s);
    }
}
