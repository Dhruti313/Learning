package Arraylistandpractise;

import java.util.ArrayList;

public class Removeduplicate {
    public static void main(String args[]){
        int arr[] = {1,1,2,3,3,4,5,5,6,6,7,7,8};

        ArrayList<Integer> a = new ArrayList<>();
//        ArrayList<Integer> nelist = new ArrayList<>();

        for(Integer e: arr){

            a.add(e);
        }
      for(Integer e:arr){
        System.out.println(e);}
    }
}
