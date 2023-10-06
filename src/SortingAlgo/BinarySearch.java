package SortingAlgo;

public class BinarySearch {
    public static void main(String args[]){
        int arr[] = {2 , 3 ,4 ,10 , 40};
        int target = 10;
        int result = binarySeach(arr , target);
        if(result ==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("position of element is :"+result);
        }
    }
    public static int binarySeach(int arr[] , int target){
        int  l = 0;
        int r = arr.length-1;
        while(l <= r){
            int mid = ( l +r) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                return mid +1;
            }
            else{
                return mid-1;
            }
        }
        return -1;
    }
}
