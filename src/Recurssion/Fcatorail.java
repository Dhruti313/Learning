package Recurssion;

public class Fcatorail {
    public static void main(String args[]){
        int n = 9;
       System.out.println( printFact(n));
    }
    public static int printFact( int n ){
        if(n==0){
          return 1 ;
        }
       else{
           return(n *printFact(n-1));

        }
    }
}
