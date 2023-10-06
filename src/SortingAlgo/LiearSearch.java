package SortingAlgo;

public class LiearSearch {
    public static void main(String args[]){
        int arr[] = {56 , 30 , 20 , 41 , 67 , 31 , 14 , 52};
        int target = 52;
        int n = arr.length;

        int res = linearSearch(arr , target , n);
        if(res == -1){
            System.out.println("element not found");
        }
        else{
            System.out.println("position of element in array is : " + res);
        }
    }
     static int linearSearch(int arr[] , int target , int n){

        for(int k = 0 ; k <n ; k++){
            if(arr[k] == target){
                return k;
            }
        }
      return  -1;
    }

}
