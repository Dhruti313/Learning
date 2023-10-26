package DS;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> qu){
        Stack<Integer> st = new Stack<>();
        while(!qu.isEmpty()){
            st.push(qu.remove());
        }
        while(!st.isEmpty()){
            qu.add(st.pop());
        }

    }
    public static void main(String args[]){
        Queue<Integer> qu = new ArrayDeque<>();
        qu.add(10);
        qu.add(20);
        qu.add(30);
        qu.add(40);
        System.out.println("before reverse : "+qu);
        reverseQueue(qu);
        System.out.println("after reverse : "+qu);
    }
}
