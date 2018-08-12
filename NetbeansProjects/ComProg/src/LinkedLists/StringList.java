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
public class StringList {
    
    Node head;
    Node tail;

    public StringList() {
        head = null;
        tail = null;
    }
    
    public void addFirst(char data) {
        if (head == null) {
            head = new Node(data, head);
            tail = head;
        }
        else {
            head = new Node(data, head);
        }
    }
    
    public void addLast(char data) {
        if (head == null) {
            addFirst(data);
        }
        else {
            tail.next = new Node(data, null);
            tail = tail.next;
        }
    }
    
    public void add(char data) {
        addLast(data);
    }
    
    public void sort() {
        Node i;
        Node j = head.next;
        
        while (j != null) {
            i = head;
            while (i != null) {
                if (i.data > j.data) {
                    swapNode(i, j);
                }
                i = i.next;
            }
            j = j.next;
        }
    }
    
    public void swapNode(Node i, Node n) {
        char data = i.data;
        i.data = n.data;
        n.data = data;
    }
    
    public void printList() {
        Node temp = head;
        System.out.print("Contents: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    /* Inner Class */
    public class Node {
        char data;
        Node next;
        
        public Node(char d, Node n) {
            data = d;
            next = n;
        }
    }
}
