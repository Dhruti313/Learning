package Package2array;

public class Addtwomatrices {
    public static void addMatrix(int[][] a, int[][] b){
        System.out.println(a);

        int c[][] = new int[2][2];
        int rows = 2; int columns = 2;

        for(int i = 0 ; i<rows ; i++){
            for(int j = 0 ; j<columns; j++){

                c[i][j] = a[i][j]  + b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        int a[][] = {{1,2},{1,2}};
        int b[][] = {{2,3},{5,6}};
        addMatrix(a,b);


    }
}
