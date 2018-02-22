/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Name of the User
 */
public class DS_SLinkedList implements ADT_SLinkedList {

    protected Node head;
    protected Node tail;
    protected long size;
    protected int occur;
    protected int pos;
    
    public DS_SLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.pos = 0;
        this.occur = 0;
    }
    
    @Override
    public void addFirst(Object item) {
        if (head == null) {
            head = new Node(item, head);
            tail = head;
        }
        else {
            head = new Node(item, head);
        }
        size++;
    }

    @Override
    public void addLast(Object item) {
        if (head == null) {
            addFirst(item);
        }
        else {
            tail.next = new Node(item, null);
            tail = tail.next;
            size++;
        }
    }
    
    @Override
    public void insertAfter(Object item, Object key) {
        Node start = head;
        for (int i=0;i<this.getNodeSize();i++) {
            if (!start.equals(null) && !start.data.equals(key)) {
                start = start.next;
            }
        }
        if (!start.equals(null)) {
            start.next = new Node(item, start.next);
            this.size++;
        }
    }
    
    @Override
    public void insertBefore(Object item, Object key) {
        Node start = head;
        Node current = start;
        Node previous = null;
        
        if (start.equals(null)) {
            return;
        }
        
        if (start.data.equals(key)) {
            addFirst(item);
            return;
        }
        
        for (int i=0;i<this.getNodeSize();i++) {
            while (current.equals(null) && current.data.equals(key)) {
                previous = current;
                current = current.next;
            }
        }
        
        if (current.equals(null)) {
            previous.next = new Node(item, current);
            size++;
        }
    }
    
    @Override
    public void printData() {
        Node start = head;
        System.out.print("\n\nLinked-list items are: ");
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
    
    @Override
    public long getNodeSize() {
        return this.size;
    }
    
    @Override
    public void search(Object item) {
        String tag1 = "";
        String tag2 = "";
        if (isFound(item)) {
            if (this.occur > 1) {
                tag1 = "are ";
                tag2 = "s";
            }
            else {
                tag1 = "is ";
                tag2 = "";
            }
            System.out.println("\n" + "There "+ tag1 + this.occur + " occurence" + tag2 + " of " + item + ". ");
            System.out.println("\n" + item + " on position " + (this.pos + 1) + ". ");
        }
        else {
            System.out.println("\n" + item + " doesn't exist. ");
        }
    }
    
    @Override
    public void remove(Object item) {
        Node prev = null;
        Node cur = head;
        while (cur != null) {
            if (cur.data.equals(item)) {
                if (prev == null) {
                    head = cur.next;
                }
                else {
                    prev.next = cur.next;
                }
                size--;
            }
            else {
                prev = cur;
            }
            cur = cur.next;
        }
    }
    
    @Override
    public boolean isFound(Object item) {
        Node cur = head;
        while (cur != null) {
            if (cur.data.equals(item)) {
                this.occur++;
                return true;
            }
            cur = cur.next; 
            this.pos++;
            
        }
        return false;
    }
    
//    @Override
//    public boolean isDuplicate(Object item) {
//        boolean mark = false;
//        if (isFound(item)) {
//            mark = true;
//        }
//        return mark;
//    }
    
    private class Node {
        private Object data;
        private Node next;
        
        public Node(Object s, Node n) {
            data = s;
            next = n;
        }
    }
}
