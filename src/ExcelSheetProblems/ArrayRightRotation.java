package ExcelSheetProblems;

public class ArrayRightRotation {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};    //3,2,1,7,6,5,4
        int d = 2;
        int k = 0;
        rotate(arr, d , k);
    }

    public static void rotate(int[] arr, int d , int k) {
        int temp[] = new int[arr.length];

        for(int i = 0; i<=d ; i++){
            temp[k] = arr[i];
            k++;
        }
        for(int i = arr.length -1; i >d ; i--){
            temp[k] = arr[i];
            k++;
        }
        for(int  i = 0 ; i<arr.length ; i++){
            arr[i] = temp[i];

        }
        for(int  i = 0 ; i<arr.length ; i++) {
            System.out.print(arr[i] +" ");

        }

    }

}