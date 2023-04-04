package MyLearning;

public class Select {
    public static void main(String args []){
        int arr [] = { 10,9,30,45,15};

        for(int i = 0 ; i<arr.length -1 ; i++){
            int smallest = i;
            for( int j = i+1 ; j<arr.length ; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;

                }

            }
            int previous = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = previous;
        }
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
