package MyLearning;

public class RotateNumber {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;
//    for(int i = 0 ; i<d ; i++){
//        int last = arr[0];

//        for(int j = 0 ; j<arr.length-1 ; j++){
//            arr[j] = arr[j+1];
//
//        }
//        arr[arr.length-1]=last;
//
//    }
//
//    for(int i = 0 ; i<arr.length; i++){
//        System.out.print(arr[i]);
//
//    }
//        System.out.println();
        for (int i = 0; i < d; i++) {
            int last = arr[arr.length-1];
            for (int k = arr.length-1; k>0; k--) {
                arr[k] = arr[k-1];
            }

            arr[0] = last;

        }

        for(int i = 0 ; i<arr.length; i++){
        System.out.print(arr[i]);
    }

    }
}