/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListOfStack;

/**
 *
 * @author Name of the User
 */
public class LinkedList {
    
    Node head;
    Node tail;
    
    public LinkedList() {
        head = null;
        tail = null;
    }
    
    public void addFirstStack(Stack data) {
        if (head == null) {
            head = new Node(data, head);
            tail = head;
        }
        else {
            head = new Node(data, head);
        }
    }
    
    public void addLastStack(Stack data) {
        if (head == null) {
            addFirstStack(data);
        }
        else {
            tail.next = new Node(data, null);
            tail = tail.next;
        }
    }
    
    public void addStack(Stack data) {
        addLastStack(data);
    }
    
    public void printStacks() {
        Node temp = head;
        int count = 0;
        System.out.println("Contents: ");
        while (temp != null) {
            count++;
            System.out.print("Stack " + count + ": ");
            temp.data.display();
            System.out.println("");
            temp = temp.next;
        }
    }
    
    /* STACK OPERATIONS FROM LINKEDLIST  */
    public void pushToStack(int pos, int data) {
        Node temp = head;
        int prepos = 1;
	while (prepos != pos) {
		prepos++;
                temp = temp.next;
	}
	temp.data.push(data);
    }
    
    public int popToStack(int pos) {
        Node temp = head;
        int prepos = 1;
        while (prepos != pos) {
		prepos++;
                temp = temp.next;
	}
        return temp.data.pop();
    }
    
    
    /* INNER NODE CLASS */
    private class Node {
        Stack data;
        Node next;
        
        public Node(Stack d, Node n) {
            data = d;
            next = n;
        }
    }
}
