
import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinarySearchTreeInsert {
   
  	public static void preOrder( Node root ) {
      
    	if( root == null)
        	return;
      
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
     
    }
  	
  	public static Node insert(Node root,int data) {
        if (root == null) {
            return new Node(data);
        } else {
            if (data < root.data) {
                insertLeft(root, data);
            } else {
                insertRight(root, data);
            }
        }
        return root;
    }

    public static void insertLeft(Node node, int data) {
        if (node.left == null) {
            node.left = new Node (data);
        } else {
            if (data < node.data) {
                insertLeft(node.left, data);
            } else {
                insertRight(node.right, data);
            }
        }
    }

    public static void insertRight(Node node, int data) {
        if (node.right == null) {
            node.right = new Node (data);
        } else {
            if (data < node.data) {
                insertLeft(node.left, data);
            } else {
                insertRight(node.right, data);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
      	preOrder(root);
    }	
}