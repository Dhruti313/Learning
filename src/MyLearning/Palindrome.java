package MyLearning;

import java.util.Scanner;

public class Palindrome {
    public static boolean checkpalindrome(){
        String str = "civic";
        for(int i = 0 ; i<str.length() ; i++){
            for(int j = str.length() -1; j>=0 ; j--){
                if(str.charAt(i) != str.charAt(j)){
                    return false;
                }
                else {
                    return true;
                }
            }

        }
        return true;
    }
    public static void main(String [] args){
        System.out.println( checkpalindrome());


    }
}
