package LearningNew;
import java.util.Scanner;
 public class MatrixPrinter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first string: ");
            String str1 = scanner.nextLine().toUpperCase();
            System.out.print("Enter the second string: ");
            String str2 = scanner.nextLine().toUpperCase();
            scanner.close();

            char[][] matrix = new char[5][9];

            // Initialize the matrix with *
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 9; j++) {
                    matrix[i][j] = '*';
                }
            }

            // Insert the first string in the matrix vertically
            int row = 1, col = 2;
            for (int i = 0; i < str1.length(); i++) {
                matrix[row][col] = str1.charAt(i);
                row++;
            }

            // Find the common character and insert the second string in the matrix horizontally
            for (int i = 0; i < str2.length(); i++) {
                if (str2.charAt(i) == 'A') {
                    col = i;
                    break;
                }
            }
            row = 2;
            for (int i = 0; i < str2.length(); i++) {
                matrix[row][col] = str2.charAt(i);
                col++;
            }

            // Print the matrix
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


