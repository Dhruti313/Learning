package Arraylistandpractise;

import java.util.ArrayList;
import java.util.Iterator;

public class Usingiterator {
    public static void main(String  args[]){
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        Iterator i = al.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
