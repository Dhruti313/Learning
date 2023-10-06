import java.util.Scanner;

public class MatrixRepresentation {
    public static void main(String[] args) {
        char[][] matrix = createMatrix();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string to be placed vertically: ");
        String verticalString = scanner.nextLine();
        System.out.print("Enter the coordinates of the first character (row column): ");
        int verticalRow = scanner.nextInt();
        int verticalCol = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the string to be placed horizontally: ");
        String horizontalString = scanner.nextLine();

        placeVertical(matrix, verticalString, verticalRow, verticalCol);
        placeHorizontal(matrix, horizontalString, verticalString, verticalRow, verticalCol);

        System.out.println("Matrix representation:");
        printMatrix(matrix);
    }

    public static char[][] createMatrix() {
        char[][] matrix = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = '*';
            }
        }
        return matrix;
    }

    public static void placeVertical(char[][] matrix, String word, int startRow, int startCol) {
        for (int i = 0; i < word.length(); i++) {
            matrix[startRow + i][startCol] = word.charAt(i);
        }
    }

    public static void placeHorizontal(char[][] matrix, String word, String verticalString, int verticalRow, int verticalCol) {
        int commonCol = verticalCol;
        int commonRow = verticalRow + verticalString.indexOf(word.charAt(0));

        for (int i = 0; i < word.length(); i++) {
            matrix[commonRow][commonCol + i] = word.charAt(i);
        }
    }

    public static void printMatrix(char[][] matrix) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
