package Cdac;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius");
        int  r = sc.nextInt();

        System.out.println("Area of Circle is : "+ (2 * 3.14 *r ));
        System.out.println("Circumference of Circle is :" +(3.14 * r *r));


    }
}
