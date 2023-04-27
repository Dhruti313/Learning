package Package2array;

import java.util.Scanner;

public class MagicSquare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of matrix");
        int n = sc.nextInt();


        int a[][] = new int[n][n];
        int r = 0;
        int c = n/2;

        for(int i = 1 ; i<=n*n ; i++){
            a[r][c]=i;
            if(i%n ==0){
                r++;
            }
            else{
                r--;
                c--;

                if(r<0){
                    r = r + n;
                }
                if(c<0){
                    c = c + n;
                }
            }
        }
        for(r = 0 ; r<n ; r++){
            for(c = 0 ; c<n ; c++){
                System.out.print(a[r][c]+" ");
            }
            System.out.println();
        }
    }
}
