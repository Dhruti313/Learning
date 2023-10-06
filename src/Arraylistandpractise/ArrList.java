package Arraylistandpractise;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrList {
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        al.add(70);
        Iterator it = al.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }

        System.out.println();
        al.remove(3);

        Iterator itr = al.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        System.out.println();
        al.add(2,10);
        Iterator itr2 = al.iterator();
        while (itr2.hasNext()){
            System.out.print(itr2.next()+" ");
        }
        System.out.println();

       System.out.println(al.get(4));


    }
}
