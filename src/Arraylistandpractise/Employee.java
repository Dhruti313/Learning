package Arraylistandpractise;

import java.util.ArrayList;

public class Employee {
    int empno;
    String name;
    float salary;

    public Employee(int empno , String name , float salary){
        this.empno= empno;
        this.name=name;
        this.salary = salary;

    }
    void Display(){
        System.out.println(empno+ " "+ name+" " +salary);
    }
    public static void main(String args[]){
        ArrayList<Employee> e = new ArrayList<>();
        Employee e1 = new Employee(101,"ram",4000);
        Employee e2 = new Employee(102,"sham",5000);

        e.add(e1);
        e.add(e2);
        for(Employee ed :e){
            ed.Display();
        }
    }
}
