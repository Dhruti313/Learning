package Leetcodeproblems;

import java.util.Arrays;

public class CopyingOneToOtherArray {
    public static void main(String args[]){
        //first method
//        int a[] = {1,2,3,4,5};
//        int b[]= new int[a.length];

//        for(int  i = 0 ; i<a.length ; i++){
//            b[i] = a[i];
//            b[0]++;
//
//        }  System.out.print("a length -->");
//        for(int  i = 0 ; i<a.length ; i++){
//            System.out.print(a[i]+" ");
//        }
//        System.out.println();
//        System.out.print("b length -->");
//
//        for(int  i = 0 ; i<b.length ; i++){
//            System.out.print(b[i]+" ");
//        }
        //second method
//        int a[] = {1,2,3,4,5};
//        int b[] = a.clone();
//
//        System.out.print("a length -->");
//        for(int  i = 0 ; i<a.length ; i++){
//            System.out.print(a[i]+" ");
//        }
//        System.out.println();
//        System.out.print("b length -->");
//
//        for(int  i = 0 ; i<b.length ; i++){
//            System.out.print(b[i]+" ");
//        }
//third method
//              int a[] = {1,2,3,4,5};
//              int b[]= new int[a.length];
//              System.arraycopy(a,0,b,0,5);
//        System.out.print("a length -->");
//        for(int  i = 0 ; i<a.length ; i++){
//            System.out.print(a[i]+" ");
//        }
//        System.out.println();
//        System.out.print("b length -->");
//
//        for(int  i = 0 ; i<b.length ; i++){
//            System.out.print(b[i]+" ");
//        }
        //fourth method
        int a [] = {1,2,3,4,5};
        int b [] = Arrays.copyOf(a,5);
        System.arraycopy(a,0,b,0,5);
        System.out.print("a length -->");
        for(int  i = 0 ; i<a.length ; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("b length -->");

        for(int  i = 0 ; i<b.length ; i++){
            System.out.print(b[i]+" ");
        }
    }
}
