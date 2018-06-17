/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedLists;

/**
 *
 * @author Name of the User
 */
public class Linkedlist3 {
    static class Node {
        int data;
        Node next;

        public Node(int d, Node n) {
            data = d;
            next = n;
        }
    }
    
    static Node head;
    static Node tail;
    static Node sorted;
    
    static void addFirst(int data) {
        if (head == null) {
            head = new Node(data, head);
            tail = head;
        }
        else {
            head = new Node(data, head);
        }
    }
    
    static void addLast(int data) {
        if (head == null) {
            addFirst(data);
        }
        else {
            tail.next = new Node(data, null);
            tail = tail.next;
        }
    }
    
    static void add(int data) {
        addLast(data);
    }
    
    static void printList() {
        Node temp = head;
        
        System.out.print("Contents: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    static void insertionSort(Node headref) 
    {
        // Initialize sorted linked list
        sorted = null;
        Node current = headref;
        // Traverse the given linked list and insert every
        // node to sorted
        while (current != null) 
        {
            // Store next for next iteration
            Node next = current.next;
            // insert current in sorted linked list
            sortedInsert(current);
            // Update current
            current = next;
        }
        // Update head_ref to point to sorted linked list
        head = sorted;
    }
    
    static void sortedInsert(Node newnode) 
    {
        /* Special case for the head end */
        if (sorted == null || sorted.data >= newnode.data) 
        {
            newnode.next = sorted;
            sorted = newnode;
        }
        else
        {
            Node current = sorted;
            /* Locate the node before the point of insertion */
            while (current.next != null && current.next.data < newnode.data) 
            {
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }
    }
    
    public static void main(String[] args) {
        for (int i=0;i<10;i++) {
            int rand = (int) Math.floor(Math.random() * (20 + i));
            add(rand);
        }
        printList();
        insertionSort(head);
        System.out.println("");
        printList();
    }
}
