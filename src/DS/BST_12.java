package DS;

public class BST_12 {
    class Node{
        int key;
        Node left;
        Node right;

        Node(int item){
            key = item;
            left = right =null;
        }
    }
    Node root;
    BST_12() {
        root = null;
    }
    BST_12(int value){
        root = new Node(value);
    }
    void insert(int key){
        root = insertRec(root , key);
    }
    Node insertRec(Node root , int key){
        if(root == null){
            root = new Node(key);
            return root;
        } else if (key <root.key) {
            root.left = insertRec(root.left , key);

        } else if (key > root.key) {
            root.right = insertRec(root.right , key);
        }
        return root;
    }
    void inorder(){
        inorderRec(root);
    }
    void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.key+" ");
            inorderRec(root.right);
        }
    }
    public static void main(String args[]){
        BST_12 bt = new BST_12();
        bt.insert(40);
        bt.insert(10);
        bt.insert(60);
        bt.insert(20);
        bt.insert(90);
        bt.insert(30);
        bt.inorder();
    }
}
