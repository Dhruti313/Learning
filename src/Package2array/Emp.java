package Package2array;

import java.util.Scanner;
 class Main{
    public static void main(String args[]){
        Emp emp = new Emp();
        emp.readEmpData();
        emp.displayEmpData();

    }

}
public class Emp {
    int empno;
    String empname;
    String designation;
    String dept;
    double sal;

    public void readEmpData (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee number");
        empno = sc.nextInt();

        System.out.println("Enter employee name");
        empname = sc.next();

        System.out.println("Enter employee designation");
        designation= sc.next();

        System.out.println("Enter employee department");
        dept= sc.next();

        System.out.println("Enter employee salary");
        sal = sc.nextDouble();
    }
    public void displayEmpData(){
        System.out.println( "employee number is : "+empno);
        System.out.println( "employee name is : "+empname);
        System.out.println( "employee designation is : "+designation);
        System.out.println( "employee department is : "+dept);
        System.out.println( "employee salary is : "+sal);
    }
}
