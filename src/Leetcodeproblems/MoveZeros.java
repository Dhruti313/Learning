package Leetcodeproblems;

public class MoveZeros {
    public static void main(String args[]){
        int arr[] = {0,1,0,3,12};

        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr.length -1 - i ; j++){
                if(arr[j] == 0 ){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
