package Leetcodeproblems;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoSortedArray {
    public static boolean sortedArray(int[] a, int[] b) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], true);
        }
        for (int i = 0; i < b.length; i++) {
            map.put(b[i], true);
        }
        for(Map.Entry<Integer , Boolean> e : map.entrySet())
            System.out.println(e.getKey() +" "+ e.getValue());
        return false;
    }

    public static void main(String args[]) {
        int a[] = {1, 3, 5};
        int b[] = {1, 2, 4};
        boolean b1 = sortedArray(a, b);

    }

}