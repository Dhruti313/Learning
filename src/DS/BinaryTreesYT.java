package DS;
import java.util.*;
import java.util.LinkedList;


public class BinaryTreesYT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right =null;
        }
    }
    static class BinaryTree{
        static int index = -1;
        public static Node buildtree(int nodes[]){
            index++;
            if(nodes[index]== -1){
                return null;
            }

            Node newnode = new Node(nodes[index]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);

            return newnode;
        }
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelorder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }

            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static int countofnodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNode = countofnodes(root.left);
        int rightNode = countofnodes(root.right);
        return leftNode + rightNode +1;
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        int myheight = Math.max(leftheight , rightheight) +1;
        return myheight;
    }
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);

//        System.out.print(root.data);
//        System.out.println();
//        preorder(root);
//        System.out.println();
//        inorder(root);
//        System.out.println();
//        postorder(root);
//        System.out.println();
//        levelorder(root);
        System.out.println(countofnodes(root));
        System.out.println(height(root));
    }
}
