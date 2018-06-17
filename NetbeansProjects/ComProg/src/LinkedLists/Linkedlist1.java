/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Name of the User
 */

// THIS PROGRAM IS ITERATING OVER A LINKED LIST

public class Linkedlist1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        
        // Initializing list
        for (int i=0;i<10;i++) {
            linkedlist.add(i+1);
        }
        
        // Iterating through list using Iterator
        System.out.println("****ITERATOR****");
        Iterator i = linkedlist.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println("\n****ITERATOR****");
        System.out.println("");
        
        // Iterating through list using while loop
        System.out.println("****WHILE LOOP****");
        int num = 0;
        while (linkedlist.size() > num) {
            System.out.print(linkedlist.get(num) + " ");
            num++;
        }
        System.out.println("\n****WHILE LOOP****");
        System.out.println("");
        
        // Iterating through list using for loop (Advanced version)
        System.out.println("****FOR LOOP****");
        for (int j : linkedlist) {
            System.out.print(j + " ");
        }
        System.out.println("\n****FOR LOOP****");
        System.out.println("");
        
        // Iterating through list using stream function 
        System.out.println("****STREAM FUNCTION****");
        linkedlist.stream().forEach((s) -> {
            System.out.print(s + " ");
        });
        System.out.println("\n****STREAM FUNCTION****");
        System.out.println("");
        
        // Iterating through list using for loop (Basic version)
        System.out.println("****FOR LOOP****");
        for (int j=0;j<linkedlist.size();j++) {
            System.out.print(linkedlist.get(j) + " ");
        }
        System.out.println("\n****FOR LOOP****");
        System.out.println("");
    }
}
