package JavaAssignment_;

import java.util.Scanner;

public class MatrixRowCol_ {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string");
        String str2 = sc.nextLine();

        char[][] matrix = new char[10][10];
        //for printing stars
        for(int i = 0 ; i<10 ; i++){
            for(int j = 0 ; j<10 ; j++){
                matrix[i][j] = '*';
            }
        }
        //printing first elements
        int row = 1;
        int col = 2;
        for(int  i = 0 ; i<str1.length() ; i++){
            matrix[row][col]=str1.charAt(i);
            row++;
        }

        for(int i = 0 ; i<str2.length() ; i++){
                if(str2.charAt(i)=='A'){
                    col = i;
                    break;
                }
            }

        // printing second elem
        row= 2;
        for(int i = 0 ; i <str2.length() ; i++){
            matrix[row][col] = str2.charAt(i);
            col++;
        }
        //printing matrix
        for(int i = 0 ; i<10 ; i++){
            for(int j = 0 ; j<10 ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
