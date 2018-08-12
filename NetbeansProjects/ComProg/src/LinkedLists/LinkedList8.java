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
public class LinkedList8 {
    public static void main(String[] args) {
        LinkedListClass list = new LinkedListClass();
        
//        for (int i=0;i<10;i++) {
//            int rand = (int) Math.floor(Math.random() * 20);
//            list.add(rand);
//        }
//        list.printList();
//        System.out.println("");
//        list.sortList();
//        list.printList();
//        System.out.println("");
//        list.getFirst();
//        System.out.println("");
//        list.getLast();
//        System.out.println("");
        list.addFirstLast(10, 20);
        list.printList();
    }
}
