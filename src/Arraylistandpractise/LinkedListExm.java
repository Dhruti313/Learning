package Arraylistandpractise;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExm {
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

        for(Integer e : ll){
            System.out.print(e+" ");
        }
        System.out.println();
        ll.add(2,60);
        for(Integer e : ll){
            System.out.print(e+" ");
        }
        System.out.println();
        ll.remove(1);
        for(Integer e : ll){
            System.out.print(e+" ");
        }
        System.out.println();
        ll.addFirst(10);
        for(Integer e : ll){
            System.out.print(e+" ");
        }
        System.out.println();
        ll.addLast(100);
        for(Integer e : ll){
            System.out.print(e+" ");
        }
        System.out.println();
        ll.removeLast();
        for(Integer e : ll){
            System.out.print(e+" ");
        }




    }
}
