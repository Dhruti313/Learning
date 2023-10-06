package ExcelSheetProblems;

public class ReverseArrayFormPosition {
    public  static  void main(String ars[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int poi = 3;
        reverse(arr,poi);
        for(int i = 0 ; i <arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int arr[], int poi){
        for(int i = 0 ; i<arr.length ; i+=poi){
            int start = i;
            int end = Math.min(i+poi-1 , arr.length -1);
            while(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
}
