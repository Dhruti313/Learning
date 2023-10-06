package Arraylistandpractise;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class ElecBill {
    int cunumber;
    String cuname;
    float units;
    
    public void readData(){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the customer name");
        cuname = sc.next();
        
        System.out.println("enter the customer id");
        cunumber = sc.nextInt();
        
        System.out.println("enter the units");
        units = sc.nextInt();

        double result = 0;

        if(units <100){
            result = units * 1.20;
        } else if (units < 300) {
            result = 100 * 1.20 +((units -100) *2);

        } else if (units >300) {
            result = 100 * 1.20 + 200 *2 +((units - 300)*3);

        }
        System.out.println(result);
    }
    public void showData(){
       System.out.println(cuname+" "+cunumber);

    }
    public static void main(String args[]){
        ElecBill e = new ElecBill();
        e.readData();
        e.showData();

    }
}
