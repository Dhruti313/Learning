package Arraylistandpractise;

import java.util.Scanner;

public class Emp {
    String name;
    static int id;
    float salary;
    String desig;



    void readempo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id");
        id = sc.nextInt();
        System.out.println("enter name");
        name = sc.next();
        System.out.println("enter salary");
        salary = sc.nextFloat();
        System.out.println("enter designation");
        desig = sc.next();
    }
    public  void displayEmp() {
        System.out.println(id+ " "+ name+" " +desig+" " +salary);
    }
    public static void main(String args[]){
            Emp e = new Emp();
            System.out.println("enter employee info");
            e.readempo();
            e.displayEmp();

    }
}
