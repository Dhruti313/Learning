package GeeksForGeeks;

public class ElemnetsGreaterThanTwo
{
    public static void main(String args[]){
        int arr[] = {2, 8, 7, 1, 5};
        count(arr);
    }
    public static void count(int arr[]){

        for (int i = 0 ; i <arr.length  ; i++){
            int count =0;
            for(int j = 0 ; j <arr.length; j++){
                if(arr[j] > arr[i]){
                    count++;
                }
            }
            if(count >=2){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
