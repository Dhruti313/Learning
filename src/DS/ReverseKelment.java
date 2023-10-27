package DS;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseKelment {
    public static void main(String args[]){
        Queue<Integer> qu = new ArrayDeque();
        int k = 3;
        qu.add(12);
        qu.add(22);
        qu.add(32);
        qu.add(42);
        qu.add(52);
        System.out.println(reverse(qu , k));
    }
    public static Queue<Integer> reverse(Queue <Integer> qu , int k){
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i <k ; i++){
            st.push(qu.remove());
        }
        while(!st.isEmpty()){
            qu.add(st.pop());
        }
        for(int i  =0 ; i <qu.size() - k ; i++){
            qu.add(qu.remove());
        }
        return qu;
    }
}
