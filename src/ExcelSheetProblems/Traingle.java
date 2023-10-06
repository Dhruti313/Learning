package ExcelSheetProblems;

import java.awt.*;

public class Traingle {
    public static void main(String args[]) {
        int n = 5;
        Traingle(n);
    }

    public static void Traingle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i <= j) {
                    System.out.print("*" );
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}