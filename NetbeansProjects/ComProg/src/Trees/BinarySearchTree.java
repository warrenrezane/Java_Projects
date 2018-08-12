/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

/**
 *
 * @author Name of the User
 */
public class BinarySearchTree {
    
    Node root;
    Node current;
    
    public BinarySearchTree() {
        root = null;
        current = null;
    }
    
    public BinarySearchTree(int data) {
        root = new Node(data, null, null);
        current = root;
    }
    
    public BinarySearchTree(Node root) {
        this.root = root;
        current = root;
    }
    
    public boolean insert(int data) {
        if (root == null) {
            root = new Node(data, null, null);
            current = root;
            return true;
        }
        else {
            Node temp = root;
            while (temp != null) {
                if (data < temp.data) {
                    if (temp.left == null) {
                        temp.left = new Node(data, null, null);
                        return true;
                    }
                    else {
                        temp = temp.left;
                    }
                }
                else {
                    if (temp.right == null) {
                        temp.right = new Node(data, null, null);
                        return true;
                    }
                    else {
                        temp = temp.right;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean search(int data) {
        if (root == null) {
            return false;
        }
        else {
            Node temp = root;
            while (temp != null) {
                if (temp.data == data) {
                    return true;
                }
                else {
                    if (data < temp.data) {
                        temp = temp.left;
                    }
                    else {
                        temp = temp.right;
                    }
                }
            }
        }
        return false;
    }
    
    public void preOrder() {
        if (root != null) {
            System.out.print(root.data + " ");
            new BinarySearchTree(root.left).preOrder();
            new BinarySearchTree(root.right).preOrder();
        }
    }
    
    public void inOrder() {
        if (root != null) {
            new BinarySearchTree(root.left).inOrder();
            System.out.print(root.data + " ");
            new BinarySearchTree(root.right).inOrder();
        }
    }
    
    public void postOrder() {
        if (root != null) {
            new BinarySearchTree(root.left).postOrder();
            new BinarySearchTree(root.right).postOrder();
            System.out.print(root.data + " ");
        }
    }
    
    /* Inner Node class */
    public class Node {
        Node left, right, parent;
        int data;

        public Node() {
            left = null;
            right = null;
            parent = null;
            data = -1;
        }
        
        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
            this.parent = null;
        }
    }
    
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        
        for (int i=0;i<10;i++) {
            int rand = (int) Math.floor(Math.random() * 20);
            tree.insert(rand);
        }
        
        System.out.print("Pre-order: ");
        tree.preOrder();
        System.out.print("\nIn-order: ");
        tree.inOrder();
        System.out.print("\nPost-order: ");
        tree.postOrder();
        
        System.out.println("");
        
        if (tree.search(2)) {
            System.out.println("Exists! ");
        }
        else {
            System.out.println("Not found! ");
        }
    }
}
