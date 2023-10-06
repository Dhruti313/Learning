package Leetcodeproblems;

//public class MoveZerosToENd {
    //public static void main(String args[]) {
//        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
//        zero(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//
//    public static void zero(int arr[]) {
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                arr[count++] = arr[i];
//            }
//            while (count < arr.length) {
//                arr[count++] = 0;
//            }
//        }
//    }
//}
    class PushZero
    {
        static void pushZerosToEnd(int arr[], int n)
        {
            int count = 0; // Count of non-zero elements/ with this element
            for (int i = 0; i < n; i++)
                if (arr[i] != 0)
                    arr[count++] = arr[i]; // here count is
            while (count < n)
                arr[count++] = 0;
        }

        /*Driver function to check for above functions*/
        public static void main (String[] args)
        {
            int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
            int n = arr.length;
            pushZerosToEnd(arr, n);
            System.out.println("Array after pushing zeros to the back: ");
            for (int i=0; i<n; i++)
                System.out.print(arr[i]+" ");
        }
    }

