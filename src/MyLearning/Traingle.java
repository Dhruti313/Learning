package MyLearning;

import java.util.Scanner;

public class Traingle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times u need input");
        int f = scanner.nextInt();

        for (int i = 0; i < f; i++) {

            System.out.println("Enter the side");
            int s = scanner.nextInt();

            int b = s * s;
            System.out.println("area : " + b);
        }
    }
}
