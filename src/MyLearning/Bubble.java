package MyLearning;

public class Bubble {
    public static void Array(int arr[]){
        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String args[]){
        int arr[] = { 2,5,3,10,8};

        for( int i = 0; i< arr.length-1 ; i++){
            for (int j = 0 ; j < arr.length - 1 -i ; j++){

                if(arr[j] > arr[j+1]){
                    int prevoius = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = prevoius;
                }
            }
        } Array(arr);


    }


}
