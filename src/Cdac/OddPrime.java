package Cdac;

import java.util.Scanner;

public class OddPrime {
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int d = sc.nextInt();


        if(d%2 ==0){
            System.out.println("Number is even");
            System.out.println("Square of number s :" + (d*d));

        } else {
            System.out.println("Number is odd");
            System.out.println("Cube of number is " +(d * d *d));
        }
    }
}
