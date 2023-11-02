package GeeksForGeeks;

public class IndexReturnRotatingNumber {
    public static void main(String args[]){
        int arr[]={15 , 18 , 2 , 3, 6 ,12};
        System.out.print(count(arr));
    }
    public static int count(int[] arr){
        int min = arr[0];
        int min_index = 0;
        for(int i  =0 ; i < arr.length-1 ; i++){
            if(min > arr[i]){
                min = arr[i];
                min_index = i;

            }
        }
        return min_index;
    }
}
