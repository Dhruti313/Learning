package MyLearning;

import java.util.Scanner;

public class Reverse2 {
    static boolean reverseString(String s){
        for(int i =0 ; i<s.length() ; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
            return  true;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = scanner.nextLine();
        //
        boolean t= reverseString(s);
        if(t==true){
            System.out.println("valid");
        }
        else {
            System.out.println("invalid");
        }


    }
}
