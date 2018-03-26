/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostfixCalculator;

/**
 *
 * @author Name of the User
 */
public class StackClass implements StackInterface {

    Node top;
    
    public StackClass() {
        top = null;
    }
    
    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. ");
            return -1;
        }
        else {
            int data = top.data;
            top = top.next;
            return data;
        }
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public void push(int elem) {
        top = new Node(elem, top);
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. ");
            return -1;
        }
        else {
            return top.data;
        }
    }

    @Override
    public void clear() {
        top = null;
    }
    
    public void printNode() {
        Node temp = top;
        System.out.println("Stack contents: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    class Node {
        int data;
        Node next;
        
        Node() {
            data = 0;
            next = null;
        }

        Node(int d, Node n) {
            data = d;
            next = n;
        }
        
        
    }
    
}
