//package PracticeForTest;
//class Node{
//    int key;
//    Node next;
//    public Node(int key){
//        this.key = key;
//        this.next = null;
//    }
//}
//class Queue(int key){
//    Node front;
//    Node rear;
//
//    public  Queue(){
//        this.front = null;
//        this.rear = null;
//    }
//    public void enqeue(int key){
//        Node temp = new Node(key);
//        if(this.rear == null){
//            this.front = this.rear= null;
//        }
//        else{
//            this.rear.next = temp;
//            this.rear = temp;
//        }
//    }
//}
//public class QueueUsingLL {
//    public static void main(String  args[]){
//        QueueLearning q = new QueueLearning(5);
//        q.enqeue(10);
//        q.enqeue(20);
//        q.enqeue(30);
//        q.enqeue(40);
//        q.enqeue(50);
//
//        if(q.rear!=null){
//            System.out.print((q.rear).key);
//        }
//    }
//
//}
