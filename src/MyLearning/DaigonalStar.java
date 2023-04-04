package MyLearning;

import java.util.Scanner;

public class DaigonalStar {
    public static void main(String[] args){
        int n = 5;

        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<=i ; j++){
                if( i>=1 && j<=i-1){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }

            }
            System.out.println();

            }

//        for (int i = 0 ; i<n ; i++){
//            for(int j = n-i ; j>1 ; j--){
//                if(i>=0 && j>1){
//                    System.out.print(" *");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }




    }
}
