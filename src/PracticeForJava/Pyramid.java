package PracticeForJava;

public class Pyramid {
    public static void main(String args[]){
        int n=7;
        for(int i =0; i<n ; i++){
            for(int j = 0 ; j<i ; j++){
                System.out.print(" ");
            }
            for(int j= i ; j< n ; j++){
                System.out.print("*" +" ");
            }
            System.out.println();
        }

        for(int i = n-1 ; i >=0 ; i--){
            for(int j = 0; j <i ; j++){
                System.out.print(" ");
            }
            for(int j = i ; j<=n-1 ; j++){
                System.out.print( "*" + " ");
            }
            System.out.println();
        }
    }
}
