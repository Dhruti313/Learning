package Leetcodeproblems;

import java.awt.geom.AffineTransform;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MergeTwoSort {
    public static void main(String args[]){
        LinkedList list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);

        LinkedList list2 = new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
System.out.println();
        Iterator<Integer> it2 = list2.iterator();
        while(it2.hasNext()){
            System.out.print(it2.next()+" ");
        }
    }
}
