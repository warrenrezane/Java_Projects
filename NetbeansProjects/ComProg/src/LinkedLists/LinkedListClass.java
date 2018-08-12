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
public class LinkedListClass {

    Node head;
    Node tail;
    int size;
    
    public LinkedListClass() {
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
    
    public void addFirstLast(int fdata, int ldata) {
        if (head == null && tail == null) {
            addFirst(fdata);
            addLast(ldata);
        }
        else {
            head = new Node(fdata, head);
            tail.next = new Node(ldata, null);
            tail = tail.next;
        }
    }
    
    public void getFirst() {
        System.out.print("First: " + head.data);
    }
    
    public void getLast() {
        System.out.print("Last: " + tail.data);
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
    
    // Same functionality if the method below
//    public void sortList() {
//        Node i;
//        Node j = head.next;
//        
//        if (head == null) {
//            return;
//        }
//        
//        do {
//            i = head;
//            while (i != j) {
//                if (i.data > j.data) {
//                    swapNode(i, j);
//                }
//                i = i.next;
//            }
//            j = j.next;
//        } while (j != null);
//    }
    
    // Shorter version of bubble sort
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
    
    public void printList() {
        Node temp = head;
        
        System.out.print("Contents: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void remove(int data) {
        Node cur = head;
        Node prev = null;
        
        if (head == null) {
            return;
        }
        
        while (cur != null) {
            if (cur.data == data) {
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
    
    public void reverseNode() {
        Node cur = head;
        Node reversedHead = null;
        Node reversedTail = null;
        
        while (cur != null) {
            if (reversedHead == null) {
                reversedHead = new Node(cur.data, reversedHead);
                reversedTail = reversedHead;
            }
            else {
                reversedHead = new Node(cur.data, reversedHead);
            }
            cur = cur.next;
        }
        
        head = reversedHead;
        tail = reversedTail;
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
