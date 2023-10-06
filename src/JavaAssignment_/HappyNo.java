package JavaAssignment_;

import java.util.Scanner;

public class HappyNo {
    public static void findNumber(int num1,int num2) {
        int rem;
        int sum = 0;
        int n;

        for(int j=num1;j<=num2;j++)
        {
            n=j;

            int number=n;
            for (int i = 1; i <= 10; i++) {

                while (n > 0) {

                    rem = n % 10;
                    int square=(rem*rem);
                    sum = (square) + sum;
                    n = n / 10;

                }

                if (sum == 1) {
                    System.out.println(number + " "+(i+1));
                    break;
                }

                n = sum;
                sum = 0;

            }
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbers::");
        int num1=s.nextInt();
        int num2=s.nextInt();
        findNumber(num1,num2);

    }
}
