package DS;
import PracticeForTest.Queue;
import java.util.Stack;

public class CFG {
    public static class Node {
        int value;
        Node next;
        Node prev;
    }
    public static class deque {
        static Node head;
        static Node tail;
        public deque() {
            this.head = null;
            this.tail = null;
        }
        private static boolean isEmpty() {
            return head == null;
        }
        public static void insertFirst(int element) {
            Node nn = new Node();
            nn.value = element;
            if (isEmpty()) {
                head = tail = nn;
                nn.next = null;
                nn.prev = null;
            } else {
                head.prev = nn;
                nn.next = head;
                nn.prev = null;
                head = nn;
            }
        }
        public static void insertLast(int element) {
            Node nn = new Node();
            nn.value = element;
            if (isEmpty()) {
                head = tail = nn;
                nn.next = null;
                nn.prev = null;
            } else {
                tail.next = nn;
                nn.prev = tail;
                nn.next = null;
                tail = nn;
            }
        }
        public void removeFirst() {
            if (!isEmpty()) {
                Node nn = head;
                head = head.next;
                head.prev = null;
            } else {
                System.out.println("list is empty");
            }
        }
        public void removeLast() {
            if (!isEmpty()) {
                Node nn = tail;
                tail = tail.prev;
                if (tail != null) {
                    tail.next = null;
                }
            } else {
                System.out.println("list is empty");
            }
        }
        public void display() {
            if (!isEmpty()) {
                Node temp = head;
                while (temp != null) {
                    System.out.println(temp.value+" ");
                    temp = temp.next;
                }
            } else {
                System.out.println("list is empty");
            }
        }
    }
    public static class Stack{
        deque d = new deque();
        public void push(int element){
            d.insertLast(element);
        }
        public void pop(){
            d.removeLast();
        }
        public void display(){
            d.display();
        }
    }
    public static class Queue{
        deque de = new deque();
        public void enqeue(int element){
            de.insertLast(element);
        }
        public void dequeue(){
            de.removeFirst();
        }
        public void display(){
            de.display();
        }
    }
    public static void main(String args[]) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.pop();
        st.display();

        System.out.println();
        Queue queue = new Queue();
        queue.enqeue(9);
        queue.enqeue(8);
        queue.enqeue(7);
        queue.enqeue(6);
        queue.enqeue(5);
        queue.dequeue();
        queue.display();
    }
}
