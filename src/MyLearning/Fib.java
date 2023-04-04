package MyLearning;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the end digit");
        int s = scanner.nextInt();

        int a = 1;
        int b = 2;
        int result =0;

        for(int i = 0 ; i<s ; i++){
            result = a+b;

            a = b;
            b = result;

            System.out.println(result);
        }
    }
}
