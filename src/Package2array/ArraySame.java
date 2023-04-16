package Package2array;

import java.util.Arrays;

public class ArraySame {
    public static boolean Check() {
        int arr1[] = {1, 2, 5, 4, 0, 2};
        int arr2[] = {2, 4, 5, 0};

        if (arr1.length != arr2.length) {
            return false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i]) {
                    continue;

                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {
        boolean b = Check();
        System.out.println(b);

//
//
    }
}


