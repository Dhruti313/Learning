package ExcelSheetProblems;

public class AraayRotation {
    public static void main(String args[]){
        // left rotation
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
     rotate(arr , d);
    }
    public static void rotate(int[] arr, int d){
        int temp [] = new int[arr.length];
        int k =0;
        for(int i = d ; i<arr.length ; i++){
            temp[k] = arr[i];
            k++;
        }
        for(int i = 0 ; i<d ; i++){
            temp[k] = arr[i];
            k++;

        }
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = temp[i];
        }
        for(int i = 0 ; i <arr.length ; i++){
            System.out.print(arr[i]+" ");
        }


    }
}
