package MyLearning;

import java.util.Scanner;
public class traingleStarPattern {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    System.out.print(" *");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = n - 1; j >= i; j--) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }}
