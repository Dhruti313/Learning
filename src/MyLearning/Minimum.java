package MyLearning;

public class Minimum {
    public static int mini(int arr[]){
        int min = 100;

        for(int i = 0 ; i<arr.length ; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
        int arr[]= {10,40,34,78,5};
        System.out.println("Mimimum number from arry"+mini(arr));
    }
}


