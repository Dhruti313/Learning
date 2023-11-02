package NishantCode;

public class SquaresOfSortedArray {
    public static void main(String args[]){
        int arr[] = {-4 , -1 , 0 , 3 , 10};
        sortedArray(arr);


    }
    public static void sortedArray(int arr[]){
        int l = 0;
        int r = arr.length-1;
        int i = arr.length-1;
        int ans[] = new int[arr.length];
        while (l<=r){
            int ls = arr[l] * arr[l];
            int rs = arr[r] * arr[r];


            if(ls < rs){
                ans[i] = rs;
                r--;
            }
            else{
                ans[i] = ls;
                l++;
            }
            i--;
        }
       for(int j = 0 ; j<ans.length ; j++){
           System.out.print(ans[j]+" ");
       }
    }
}
