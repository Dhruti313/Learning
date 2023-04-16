package Package2array;

public class Multiply {
    public static void main(String args[]){
        int a[][] = {{1,2},{3,4}};
        int b[][] = {{1,2},{3,4}};
        int c[][] = new int[2][2];
        int rows = 2 ;
        int col = 2;
        for(int i = 0 ; i<rows ; i++){
            for(int j = 0 ; j<col ; j++){
                c[i][j] =0;
                for(int k = 0 ; k<rows ; k++){
                    c[i][j] +=a[i][k] * b[k][j];

                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
