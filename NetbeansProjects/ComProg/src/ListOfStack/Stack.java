/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListOfStack;

/**
 *
 * @author
 */

public class Stack {
    private Node top;

    public Stack() {
        top = null;
    }

    
    public void push(int data) {
        top = new Node(data, top);
    }

    
    public int pop() {
        if (isEmpty()) {
            System.out.print("Stack is empty");
            return -1;
        }
        else {
            int data = top.data;
            top = top.next;
            return data;
        }
    }

    
    public int peek()
    {
        if (isEmpty()) {
            System.out.print("Stack is empty");
            return -1;
        }
        else {
            return top.data;
        }
    }
    
    public void display(){
        if (isEmpty()) {
            System.out.print("Stack is empty.");
        } 
        else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + ", ");
                temp = temp.next;
            }
        }
    }
    
    
    public boolean isEmpty() {
        return top == null;
    }
    
    
    public void clear() {
        top = null;
    }
    
    private class Node {
        private int data;	
        private Node next;
        
        public Node(int d, Node n) {
          this.data = d;
          this.next = n;
        }
    }

}
