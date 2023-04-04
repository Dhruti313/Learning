package MyLearning;

import java.util.Scanner;

public class Reverse {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the String");
        String input = scanner.nextLine();
        String e = "";
        String f = "";

        for(int i = 0 ; i<input.length() ; i++) {

        e=e+input.charAt(i );

        }
        System.out.println( "value of e: "+e);

//        System.out.println("");
        for(int j = input.length()-1 ; j >=0 ; j--){
            f = f+input.charAt(j);
        }
        System.out.println("reverse value of f : " +f);



    }
}
