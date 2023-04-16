package MyLearning;

import java.util.Scanner;

public class Avrg {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum =0 ;
//        System.out.println("Enter the end limit");
//        int c = scanner.nextInt();
int n = 5;

        for(int i = 0 ; i<=n ; i++){
            sum+=i;
            System.out.println(sum);
        }
        System.out.println( "average is = "+sum/n);

    }
}
