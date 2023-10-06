package Cdac;

import java.util.ArrayList;

public class RetainAllMethodToFIndCommon {
    public static void main(String args[]){
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("hii");
        arraylist.add("geeks");
        arraylist.add("myself");
        arraylist.add("dhruti");
        arraylist.add("chirag");
        System.out.println(arraylist);

        ArrayList<String> arraylist2 = new ArrayList<>();
        arraylist2.add("hello");
        arraylist2.add("geeks");
        arraylist2.add("himself");
        arraylist2.add("dhruti");
        arraylist2.add("param");
        System.out.println(arraylist2);

        arraylist.retainAll(arraylist2);
        System.out.println(arraylist);
    }
}
