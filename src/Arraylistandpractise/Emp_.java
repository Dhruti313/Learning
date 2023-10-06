package Arraylistandpractise;

import java.util.ArrayList;
import java.util.Scanner;

public class Emp_ {
    static int empno;
   static String name;
    static float sal;

    public Emp_(int empno , String name, float sal ){
        this.empno = empno;
        this.name = name;
        this.sal = sal;

    }

     static void display(){
        System.out.println(empno +" "+name+" "+sal);

    }
    public static void main(String args[]){
        ArrayList<Emp_> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the emp number");
        empno = sc.nextInt();

        System.out.println("enter the emp name");
        name = sc.next();

        System.out.println("enter the emp salary");
        sal = sc.nextFloat();

        display();

//        Scanner scanner = new Scanner(System.in);
        System.out.println("enter updated salary and name");
        sal = sc.nextInt();
        name = sc.next();

        System.out.println("after update");

       display();



    }
}
