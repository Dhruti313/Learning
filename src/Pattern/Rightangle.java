package Pattern;

public class Rightangle {
    public static void main(String args[]){
        int n = 7;

        for(int i = 0 ; i<n ; i++ ){
            for(int j = n-1 ; j>=i ; j--){
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
}
