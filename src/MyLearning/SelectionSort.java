package MyLearning;

public class SelectionSort {
    public static void Array(int arr2[]){
        for(int i = 0 ; i<arr2.length ; i++){
            System.out.print(arr2[i] +" ");
        }
    }
//    insertion
    public static void InsertionLogic(int arr1[]){
        for(int i  = 0 ; i<arr1.length- 1 ; i++){
            int smallest = i;

            for(int j = i+1 ; j<arr1.length ; j++){
                if(arr1[smallest] > arr1[j]){
                    smallest = j;

                }

            }
//             swapping replacing with smallest element
            int temp = arr1[smallest];
            arr1[smallest] = arr1[i];
            arr1[i] = temp;
        }
    }
    public static void main(String args[]){
         int arr[] = { 4,89,45,1,10};
         InsertionLogic(arr);
        Array(arr);

    }

}
