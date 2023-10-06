package JavaAssignment_;

import java.util.Scanner;

public class Padson_ {
    public static void main(String[] args) {
        System.out.println("Enter the no of Square");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long[][] squares = new long[num][4];
        for (int i = 0; i < num; i++) {
            long a = sc.nextLong();
            for (int j = 3; j >= 0; j--) {
                squares[i][j] = a % 100;
                a /= 100;
            }
        }

        for (int i = 0; i < num; i++) {
            int count = 0;
            for (int j = 0; j < num; j++) {
                if (i != j && checkPadosan(squares[i], squares[j])) {
                    count++;
                }
            }
            System.out.println((i + 1) + " " + count);
        }

    }

    public static boolean checkPadosan(long[] one, long[] two) {
        int count = 0;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if (one[i] == two[j])
                {
                    count++;
                    break;

                }
            }
            if (count == 2)
            {

                return true;

            }

        }
        return false;

    }
}
