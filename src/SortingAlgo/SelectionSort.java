package SortingAlgo;

public class SelectionSort {
    public static void main(String args[]){
        int arr[]= {64 , 78 ,100, 43 , 12};
        selectionSort(arr);
    }
    public static void selectionSort(int arr[]){
        for(int i = 0 ; i<arr.length -1 ; i++){
            int smallest= i;
            for(int j = i +1 ; j<arr.length ; j++){
               if(arr[smallest] > arr[j]){
                   smallest = j;
               }
               int temp = arr[smallest];
               arr[smallest] = arr[i];
               arr[i] = temp;

            }
        }
        for(int i = 0 ; i <arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
