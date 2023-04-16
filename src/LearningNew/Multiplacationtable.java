package LearningNew;

import java.util.Scanner;

public class Multiplacationtable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of table you want");

        int d = sc.nextInt();

        for(int i = 1; i<=10 ; i ++){
            int g = d * i;


            System.out.println(d+" "+"* "+i+ " = " +g );

        }
    }
}
