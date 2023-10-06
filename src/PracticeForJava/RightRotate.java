package PracticeForJava;

public class RightRotate {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int n = 3;
        rotate(arr , n);
    }
    public static void rotate(int arr[] , int n){
        int temp[] = new int[arr.length];
        int k =0;

        for(int i = n ; i<arr.length-1 ; i++){
            temp[k] = arr[i];
            k++;
        }
        for(int i=0;i<n ;i++){
            temp[k] = arr[i];
            k++;
        }
        for(int i= 0 ; i<arr.length-1 ; i++){
            arr[i] = temp[i];
        }
        for(int i = 0; i<arr.length-1 ; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
