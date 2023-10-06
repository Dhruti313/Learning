package PracticeForJava;

public class LinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void printData(){
        if(head == null){
            System.out.print("List is empty");
            return;
        }
        Node currnode = head;
        while(currnode !=null){
            System.out.print(currnode.data + " ->");
            currnode = currnode.next;
        }
        System.out.println("NULL");
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
        }
        head = head.next;
        return;
    }
    public void addLast(int data){
        Node newnode = new Node(data);
        if(head == null){
            System.out.print("list is empty");
            return;
        }
        Node currnode = head;
        while (currnode.next!=null){
            currnode = currnode.next;
        }
        currnode.next = newnode;
    }
    public void deleteLast(){
        if(head == null){
            System.out.print("list is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondlast = head;
        Node last = head.next;
        while(last.next != null){
            secondlast = secondlast.next;
            last = last.next;
        }
        secondlast.next = null;
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(34);
        ll.addFirst(35);
        ll.addLast(24);
        ll.printData();
    }
}
