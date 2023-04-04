package MyLearning;

import java.util.Scanner;

public class Palindrome {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");

        String d = scanner.nextLine();

        System.out.println(d);

        for(int i = 0 ; i<d.length() ; i ++){
          if(d.charAt(i) == d.charAt(d.length()-1-i)){
              System.out.println("yes");

            }
          else{
              System.out.println("no");
          }

        }






    }
}
