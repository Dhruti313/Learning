package MyLearning;

import java.util.Scanner;

public class reverse3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = scanner.nextLine();

        String f = "";
        String g = "";

        for(int i= 0 ; i<s.length() ; i++ ){
            f = f+s.charAt(i);

        }
        System.out.println(f);

        for(int j= s.length()-1 ; j >=0 ; j--){
            g = g+ s.charAt(j);

        }
        System.out.println(g);

        for(int a =0 ; a<s.length() ; a++){
            if( f.charAt(a) == g.charAt(a)){
                System.out.println("yes");

            }
            else {
                System.out.println("no");
            }
        }
        }


    }


