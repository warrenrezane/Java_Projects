/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hybrids;

/**
 *
 * @author Name of the User
 */
public class LinkedList {
    Node head;
    Node tail;
    int size;
    
    public LinkedList() {
        head = null;
        tail = null;
    }
    
    public void addFirst(int data) {
        if (head == null) {
            head = new Node(data, head);
            tail = head;
            size++;
        }
        else {
            head = new Node(data, head);
            size++;
        }
    }
    
    public void addLast(int data) {
        if (head == null) {
            addFirst(data);
        }
        else {
            tail.next = new Node(data, null);
            tail = tail.next;
            size++;
        }
    }
    
    public void add(int data) {
        addLast(data);
    }

    public void sortList() {
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
    
    public void swapNode(Node slow, Node fast) {
        int data = slow.data;
        slow.data = fast.data;
        fast.data = data;
    }
    
    public int getSize() {
        return size;
    }
    
    public void remove(int item) {
        Node prev = null;
        Node cur = head;
        while (cur != null) {
            if (cur.data == item) {
                if (prev == null) {
                    head = cur.next;
                }
                else {
                    prev.next = cur.next;
                }
            }
            else {
                prev = cur;
            }
            cur = cur.next;
        }
    }
    
    public void printList() {
        Node temp = head;
        
        System.out.print("Contents: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    public class Node {
        int data;
        Node next;

        public Node(int d, Node n) {
            data = d;
            next = n;
        }
    }
}
