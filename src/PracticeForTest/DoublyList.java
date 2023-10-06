package PracticeForTest;

public class DoublyList {
    Node head;
    class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public void addFirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            newnode.next = null;
            newnode.prev = null;
            head = newnode;
        }
        else{
            newnode.prev = null;
            newnode.next = head;
            head.prev = newnode;
            head = newnode;

        }
    }
    public void addlast(int data){
        Node newnode = new Node(data);
        Node current = head;
        newnode.next=null;
        if(head == null){
            newnode.prev = null;
            head = newnode;
        }
        else{
            while(current.next!=null) {
                current = current.next;
            }

            newnode.prev = current;
            current.next= newnode;
        }
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
        }
        else{
            head = head.next;
            head.prev = null;
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
    public void print(){
        if(head == null){
            System.out.println("list is empty");
        }
        else{
            Node currentnode = head;
            while(currentnode!=null){
                System.out.print(currentnode.data+" ");
                currentnode = currentnode.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String args[]){
        DoublyList dl = new DoublyList();
        dl.addFirst(10);
        dl.addFirst(20);
        dl.addFirst(30);
        dl.addFirst(40);
        dl.print();
        System.out.println();
        dl.addlast(100);
        dl.print();
        System.out.println();
        dl.addFirst(5);
        dl.print();
        System.out.println();
        dl.deleteFirst();
        dl.print();
        System.out.println();
        dl.deleteLast();
        dl.print();

    }

}
