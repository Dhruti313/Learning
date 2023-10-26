package DS;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueueDouble {
     Queue q1 = new LinkedList();
     Queue q2 = new LinkedList();

    public  void push1(int data){
        while (!q1.isEmpty()){
           q2.offer(q1.poll());
        }
        q1.offer(data);
        while (!q2.isEmpty()){
            q1.offer(q2.poll());
        }
    }
    public Object pop(){
        return q1.poll();
    }
    public static void main(String args[]){
        StackUsingQueueDouble st = new StackUsingQueueDouble();
        st.push1(1);
        st.push1(2);
        st.push1(3);
        st.push1(4);
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
