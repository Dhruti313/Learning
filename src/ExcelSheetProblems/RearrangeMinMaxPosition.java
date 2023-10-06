package ExcelSheetProblems;

public class RearrangeMinMaxPosition {
    public static void main(String arg[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        position(arr);
        for(int i=0;i<arr.length -1 ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void position(int arr[]){
        int min =0;
        int max=arr.length-1;
        int max_index=arr[arr.length-1]+1;

        for(int i=0; i <arr.length-1;i++){
            if(i%2==0){
                arr[i]= arr[i]+(arr[max] %max_index) * max_index;
                max--;
            }
            else{
                arr[i]= arr[i]+(arr[min] %max_index) * max_index;
                min++;
            }
        }
        for(int i=0; i <arr.length-1;i++) {
            arr[i]= arr[i]/max_index;
        }
    }
}
