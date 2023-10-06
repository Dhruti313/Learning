package Leetcodeproblems;

public class SearchIndexByForLoop {
    public static int searchLoop(int arr[] , int target){
        int index = 0;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] == target){
                return i;
            }
            if(arr[i]<target){
                index++;
            }

        }
        return index;
    }
    public static void main(String args[]){
        int arr[] = {1,3,5};
        int target = 4;
       System.out.println(searchLoop(arr , target));

    }
}
