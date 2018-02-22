/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Name of the User
 */
public class LinkedList {
    
    protected Node head;
    protected Node tail;
    
    public LinkedList() {
        head = null;
        tail = null;
    }
    
    public void addFirst(int item) {
        if (head == null) {
            head = new Node(item, head);
            tail = head;
        }
        else {
            head = new Node(item, head);
        }
    }
    
    public void addLast(int item) {
        if (head == null) {
            addFirst(item);
        }
        else {
            tail.next = new Node(item, null);
            tail = tail.next;
        }
    }
    
    public void insertBefore(int item, int key) {
        Node start = head;
        Node current = start;
        Node previous = null;
        
        if (start.equals(null)) {
            return;
        }
        
        if (start.data == key) {
            addFirst(item);
            return;
        }
        else {
            while (start != null) {
                while (current != null && current.data != key) {
                    previous = current;
                    current = current.next;
                }
            }

            if (current != null) {
                previous.next = new Node(item, current);
            }
        }
    }
    
    public void insertAfter(int item, int key) {
        Node start = head;
        while (start != null) {
            if (start != null && start.data != key) {
                start = start.next;
            }
        }
        if (start != null) {
            start.next = new Node(item, start.next);
        }
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
    
    public void splitAt(LinkedList otherList, int key) {
        Node prev = null;       
        Node cur = head;
        int NodeData = 0;
              
        if (head == null){
            return;
        }
        
        while(cur != null && cur.data != key){
            cur = cur.next;
            prev = cur;
        }
        
        this.tail = prev;
        cur = cur.next;
        
        while (cur != null) {
            NodeData = cur.data;
            otherList.addLast(NodeData);
            cur = cur.next;
        }
        
        prev = null;
        cur = head;
        
        while(cur != null && cur.data != key){
            cur = cur.next;
            prev = cur;
        } 
        
        prev.next = null;
    }
    
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
    }
    
    private class Node {
        int data;
        Node next;
        
        public Node(int d, Node n) {
            data = d;
            next = n;
        }
    }
}
