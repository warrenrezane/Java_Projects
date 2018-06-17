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
public class LinkedList4 {
    public static void main(String[] args) {
        LinkedListClass myList = new LinkedListClass();
        LinkedListClass sortedList = new LinkedListClass();
        
        myList.add(7);
        myList.add(4);
        myList.add(10);
        myList.add(2);
        myList.add(6);
        
        myList.printList();
        System.out.println("");
//        myList.sort();
//        myList.printSorted();
        myList.sortList(sortedList);
        sortedList.printList();
    }
}
