package PracticeForTest;

public class LinkedList {
    static Node head;
    class Node{
        int data;
        Node next;

        public  Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head =newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }

    }
    public void addLast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }
        else{
            Node currentnode = head;
            while(currentnode.next != null){
                currentnode = currentnode.next;
            }
            currentnode.next = newnode;
        }
    }
    public void insertAfter(int position, int data) {
      Node newnode = new Node(data);
      if(position == 0){
          newnode.next = head;
          head = newnode;
      }
      Node previous = head;
      for(int i = 0 ; i <position-1 ; i++){
          previous = previous.next;
      }
      newnode.next= previous.next;
      previous.next = newnode;

    }

    public void print(){
        if(head == null){
            System.out.print("list is empty");
        }
        else{
            Node currentnode = head;
            while(currentnode != null){
            System.out.print(currentnode.data+" ");
            currentnode = currentnode.next;
        }
            System.out.print("null");
        }
    }
    public void deleteFirst(){
        if(head == null){
            System.out.print("list is empty");
        }
        else{
            head = head.next;
        }
    }
    public void deleteLast(){
        if(head == null){
            System.out.print("list is empty");
        }
        else{
            Node secondlast = head;
            Node last = head.next;
            while(last.next !=null){
                secondlast = secondlast.next;
                last = last.next;
            }
            secondlast.next = null;
        }
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
        ll.addLast(90);

        ll.print();
        System.out.println();
        ll.deleteFirst();
        ll.print();
        System.out.println();
        ll.deleteLast();
        ll.print();
        System.out.println();
        ll.insertAfter(1,100);
        ll.print();
        System.out.println();


//        System.out.println();
//        ll.deleteinbetween(2);
//        ll.print();
    }
}
