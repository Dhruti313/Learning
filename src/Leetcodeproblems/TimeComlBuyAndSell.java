package Leetcodeproblems;

public class TimeComlBuyAndSell {
    public static int maxProfit(int arr[]){
        int maxprofit = 0 ;
        int min = arr[0];
        for(int  i = 0 ; i<arr.length ; i++){
           min = Math.min(min , arr[i]);
           int profit = arr[i] - min;
           maxprofit = Math.max(maxprofit , profit);

        }
        return maxprofit;

    }
    public static void main(String args[]){
        int arr[] = {5,3,2,6,1,4};
        System.out.print(maxProfit(arr));
    }
}
