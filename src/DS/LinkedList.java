package DS;

public class LinkedList {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addlast(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node currnode = head;
        while(currnode.next !=null){
            currnode = currnode.next;
        }
        currnode.next = newnode;
    }
    public void printlist(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currnode = head;
        while(currnode !=null){
            System.out.print(currnode.data + " ->");
            currnode = currnode.next;
        }
        System.out.print("NULL");
    }
    public  void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;

    }
    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(head.next== null){
           head = null;
            return;
        }
        Node secondlast = head;
        Node lastNode = head.next;
        while(lastNode.next!= null){
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;

    }
    public void insertPosition(String data, int pos , int i){
        Node newnode = new Node(data);
        if(pos<i){
            System.out.println("invalid position");
            return;
        }
        Node temp = head;
        while(i < pos){
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("is");
//        list.printlist();
        list.addFirst("list");
        list.addFirst("this");
        list.printlist();

        System.out.println();
        list.deleteFirst();
        list.printlist();

        System.out.println();
        list.deleteLast();
        list.printlist();
//        int i = 1;
//        int pos = 2;
        System.out.println();
        list.insertPosition("hello", 2 , 1);
        list.printlist();
        System.out.println();
        list.insertPosition("hii", 3 , 1);
        list.printlist();
    }

}