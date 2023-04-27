package Arraylistandpractise;

import java.util.ArrayList;
import java.util.Collections;

public class SOrtingwithcollectionmethod {
    public static void main(String args[]){
        ArrayList<String> al = new ArrayList<>();

        al .add("grape");
        al .add("banana");
        al .add("apple");
        al .add("cgrape");

        for(String s :al) {
            System.out.print(s+" ");
        }
        Collections.sort(al);
        System.out.println();
        for(String s :al) {
            System.out.print(s+" ");


        }

    }
}
