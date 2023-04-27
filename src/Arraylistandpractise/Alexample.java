package Arraylistandpractise;

import java.util.ArrayList;

public class Alexample {
    public static void main(String args[]){
        ArrayList<String> al = new ArrayList<>();

        al.add("grapes");
        al.add("mango");
        al.add("bananana");
        al.add("capple");
        al.add("grape");


        for(String s :al){
            System.out.print(s+ " ");
        }
    }
}
