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
    protected Node otherHead;
    protected Node otherTail;
    
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
    
    public void splitAt(LinkedList otherList, int key) {

        Node prev = null;        
        Node cur = head;
        int NodeData;
              
        if (head == null){
            return;
        }
        
        //List 2 Prop
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
        
        //List 1 Prop
        while(cur != null && cur.data != key){
            cur = cur.next;
            prev = cur;
        } 
        prev.next = null;
    }
    
    public void printList() {
        Node temp = head;
        
        while (temp != null) {
            System.out.print(temp.data + " ");
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
