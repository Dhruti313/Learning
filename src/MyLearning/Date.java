package MyLearning;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import java.util.Scanner;

public class Date {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
System.out.println(input1.length());
        for(int i =0; i < input1.length() ; i++)
        {
            if( input1.charAt(i) ==input2.charAt(0)){
                System.out.println("yes");
                System.exit(0);
            }
            else{
                System.out.println("no");

            }

        }




    }
}
