package PracticeForJava;

public class LinkedListTest {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        Node nn = new Node(data);
        if(head == null){
           head = nn;
           return;
        }
        nn.next = head;
        head = nn;
    }
    public void addLast(int data){
        Node nn = new Node(data);
        if(head == null){
            System.out.println("list is empty");
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = nn;
    }
    public void deleteFirst(){

        if(head == null){
            System.out.println("list is empty");
        }
        head = head.next;
    }
    public void deleteLast(){
        //Node nn = new Node();
        if(head == null){
            System.out.println("list is empty");
        }
        Node second = head;
        Node first = head.next;
        while(second.next!=null){
            second = second.next;
            first =first.next;
        }
        second.next = null;
    }
    public void display(){
        if(head == null){
            System.out.println("list is empty");
        }
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String args[]){
        LinkedListTest ll = new LinkedListTest();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.display();
    }
}
