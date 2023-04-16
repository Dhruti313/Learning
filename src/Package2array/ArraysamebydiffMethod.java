package Package2array;

import java.util.Arrays;

public class ArraysamebydiffMethod {
    public static void main(String args[]){
        int arr1[] = {1, 2, 5, 4, 0, 2};
        int arr2[] = {2, 4, 5, 0};

        boolean b = Arrays.equals(arr1,arr2);

        if(b == true){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
}
