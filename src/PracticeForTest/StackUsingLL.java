package PracticeForTest;

public class StackUsingLL {
    Node head;

    StackUsingLL(){
        this.head = null;
    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    public void push(int data){
        Node newnode = new Node(data);
        newnode.data = data;
        newnode.next = head;
        head = newnode;
    }
    public void pop(){
        if(head==null){
            System.out.println("stack is empty");
        }
    else{
        head = head.next;
    }
    }
    public int peek(){
        if(head==null){
            System.out.println("stack is empty");
        }
        return  head.data;
    }
    public void print(){
        if(head==null){
            System.out.println("stack is empty");
        }
        else{
            Node currentnode = head;
            while(currentnode != null){
                System.out.print(currentnode.data+" ");
                currentnode = currentnode.next;
            }
        }
    }

    public static void main(String args[]){
        StackUsingLL ll = new StackUsingLL();
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(40);
        ll.push(50);
        ll.push(60);
        ll.print();
        System.out.println();
        ll.pop();
        ll.print();
        System.out.println();
       System.out.print(ll.peek());


    }
}
