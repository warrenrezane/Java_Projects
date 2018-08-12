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
public class LinkArrayList {
    
    Node head;
    Node tail;

    public LinkArrayList() {
          head = null;
          tail = null;
    }

    public void addFirst(int[] data) {
      if (head == null) {
          head = new Node(data, head);
          tail = head;
      }
      else {
          head = new Node(data, head);
      }
    }

    public void addLast(int[] data) {
      if (head == null) {
          addFirst(data);
      }
      else {
          tail.next = new Node(data, null);
          tail = tail.next;
      }
    }
  
    public void printList() {
        int listCount = 1;
        Node cur = head;
        System.out.println("Contents: ");
        while (cur != null) {
            System.out.print("List " + listCount + ": ");
            for (int i=0;i<cur.data.length;i++) {
                System.out.print(cur.data[i] + " ");
            }
            System.out.println("");
            cur = cur.next;
            listCount++;
        }
    }

    public void add(int[] data) {
      addLast(data);
    }

    public class Node {
      int[] data;
      Node next;

      public Node(int[] d, Node n) {
        data = d;
        next = n;
      }
    }
}
