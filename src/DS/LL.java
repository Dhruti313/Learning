package DS;

public class LL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public void addData(int data){
            Node newnode = new Node(data);
            if(head == null){
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }
        public void printData(){
            if(head == null)
                System.out.println("list is empty");

                Node currnode = head;
                while(currnode!= null){
                    System.out.print(currnode.data+"--> ");
                    currnode = currnode.next;


            }
            System.out.print("NULL");
        }
        public void revrseList(){
        Node prev = null;
        Node Other = null;

        while(head!= null){
            Other = head.next;
            head.next = prev;
            prev = head;
            head = Other;
        }
        head = prev;

        }


        public static void main(String args[]){
            LL ll = new LL();
            ll.addData(1);
            ll.addData(2);
            ll.addData(3);
            ll.addData(4);
            ll.addData(5);
            ll.printData();
            System.out.println();
            ll.revrseList();
            ll.printData();
        }
}
