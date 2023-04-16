package MyLearning;

import java.util.Scanner;

 class Emp {
    private int empno;
    private String empname;
    private String designation;
    private String dept;
    private double salary;

    public void readEmpData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee number: ");
        empno = scanner.nextInt();
        scanner.nextLine(); // consume newline character
        System.out.print("Enter employee name: ");
        empname = scanner.nextLine();
        System.out.print("Enter employee designation: ");
        designation = scanner.nextLine();
        System.out.print("Enter employee department: ");
        dept = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        salary = scanner.nextDouble();
    }

    public void displayEmpData() {
        System.out.println("Employee number: " + empno);
        System.out.println("Employee name: " + empname);
        System.out.println("Employee designation: " + designation);
        System.out.println("Employee department: " + dept);
        System.out.println("Employee salary: " + salary);
    }
}
public class Main {
    public static void main(String[] args) {
        Emp emp = new Emp();
        emp.readEmpData();
        emp.displayEmpData();
    }
}

