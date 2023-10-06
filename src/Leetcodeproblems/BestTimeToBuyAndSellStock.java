package Leetcodeproblems;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int arr[]){
        int max = 0;
        for(int i = 0 ; i<arr.length ; i++){
            for(int j =i +1; j< arr.length ; j++){
                if(arr[i] < arr[j]){
                    int result = arr[j] - arr[i];
                    if(max < result){
                        max = result;


                    }
                }
            }

        }
        return max;
    }
    public static void main(String args[]){
        int arr[] = {1,2};
       System.out.print(maxProfit(arr));
    }
}
