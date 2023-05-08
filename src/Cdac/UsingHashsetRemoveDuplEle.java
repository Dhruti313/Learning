package Cdac;

import java.util.ArrayList;
import java.util.HashSet;

public class UsingHashsetRemoveDuplEle {
    public static void main(String args[]){
        ArrayList<String > arraylist = new ArrayList<>();
        arraylist.add("geeks");
        arraylist.add("for");
        arraylist.add("geeks");
        System.out.println("before values - ");
        System.out.println(arraylist);

        HashSet<String > hs = new HashSet<>(arraylist);
        System.out.println("after values - ");

        ArrayList<String> new_list = new ArrayList<>(hs);

        System.out.println(new_list);


    }

}
