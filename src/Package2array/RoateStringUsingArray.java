package Package2array;

import java.util.ArrayList;
import java.util.Stack;

public class RoateStringUsingArray {
    public static void main(String args[]){
        String s = "geeksforgeeks";
        char[]c = s.toCharArray();


        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i<c.length ; i++){
            st.push(c[i]);
            System.out.print(c[i]);
        }
        System.out.println();
       while (!st.empty()){
          System.out.print(st.pop());
       }



    }
}
