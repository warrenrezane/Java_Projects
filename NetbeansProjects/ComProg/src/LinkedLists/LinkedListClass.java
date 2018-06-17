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
    
    public LinkedListClass() {
        head = null;
        tail = null;
    }
    
    public void addFirst(int data) {
        if (head == null) {
            head = new Node(data, head);
            tail = head;
        }
        else {
            head = new Node(data, head);
        }
    }
    
    public void addLast(int data) {
        if (head == null) {
            addFirst(data);
        }
        else {
            tail.next = new Node(data, null);
            tail = tail.next;
        }
    }
    
    public void add(int data) {
        addLast(data);
    }
    
    public void printList() {
        Node temp = head;
        
        System.out.print("Contents: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    
//    public void sort() {
//        Node cur = head;
//        sorted = null;
//        Node temp = sorted;
//
//        while (cur != null) {
//            Node next = cur.next;
//           
//            if (sorted == null || sorted.data >= cur.data) {
//                cur.next = sorted;
//                sorted = cur;
//            }
//            else {
//                while (temp.next != null && temp.next.data < cur.data) {
//                    temp = temp.next;
//                }
//                cur.next = temp.next;
//                temp.next = cur;
//            }
// 
//            cur = next;
//        }
//        sorted = cur;
//    }
    
    public void sortList(LinkedListClass sortedList) {
        Node cur = head;
        Node adv = cur.next;
        
        try {
            while (cur != null) {
                if (cur.data > adv.data) {
                    sortedList.add(adv.data);
                }
                else if (cur.data < adv.data) {
                    sortedList.add(cur.data);
                }
                cur = cur.next;
                adv = adv.next;
            }
        } catch (NullPointerException e) {
            e.getMessage();
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
