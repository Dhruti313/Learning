package MyLearning;

import java.util.Scanner;

public class twoDImarr {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first matrix");

        int arr[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the second matrix");
        int arr2[][] = new int[2][2];
        for(int i = 0 ; i<2 ; i++){
            for(int j = 0 ;j<2 ; j++){
                arr2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("first matrix is");
        for(int i = 0 ; i<2 ; i++){
            for(int j = 0 ;j<2 ; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("second matrix is");
        for(int i = 0 ; i<2 ; i++){
            for(int j = 0 ;j<2 ; j++){
                System.out.print(arr2[i][j] +" ");

            }
            System.out.print(" ");
        }
        int arr3[][] = new int[2][2];

System.out.println();
        System.out.println("Matrix is");
        for(int i = 0; i<2 ; i++){
            for(int j = 0 ; j<2 ; j++){
                for(int k = 0 ; k<2 ; k++){
                    arr3[i][j] = arr3[i][j]+ arr[i][k]*arr[k][j];

                }
            }
        }
        for(int i = 0 ; i<2 ; i++){
            for(int j =0 ; j<2 ; j++){
                System.out.print(arr3[i][j] +" ");
            }
        }



    }
}
