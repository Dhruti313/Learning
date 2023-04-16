package LearningNew;

import java.util.Scanner;

public class Rollnodob {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roll No");
        int d = sc.nextInt();

        System.out.println("Enter the Birth Date");
        int de= sc.nextInt();

        System.out.println("Enter the Birth Month");
        int des = sc.nextInt();

        System.out.println("Enter the Birth Year");
        int dess = sc.nextInt();

        System.out.println("Roll No = " +d);
        System.out.println("BirthDate = " +de+"-" +des+ "-" +dess);



    }
}
