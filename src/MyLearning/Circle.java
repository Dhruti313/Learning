package MyLearning;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times input");
        int d = scanner.nextInt();

        for(int f=0 ; f<d ; f++ ){
            System.out.println("Enter the Radius");
            int r = scanner.nextInt();
            double c = 3.14 *r * r;
            System.out.println( "area : " +c);
        }

    }
}
