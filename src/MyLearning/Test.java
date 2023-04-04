package MyLearning;

import java.util.Scanner;

public class Test {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Length");
        int a = scanner.nextInt();
        System.out.println("Enter the Breadth");
        int b = scanner.nextInt();

        int c = a * b;
        System.out.println(c);

    }

}
