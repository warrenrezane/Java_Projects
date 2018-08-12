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
public class LinkedList6 {
    public static void main(String[] args) {
        LinkedListClass list = new LinkedListClass();
//        for (int i=0;i<10;i++) {
//            int rand = (int) Math.floor(Math.random() * 20);
//            list.add(rand);
//        }
//        list.printList();
//        list.sortList();
//        System.out.println("");
//        list.printList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.printList();
        System.out.println("");
        list.remove(1);
        list.remove(4);
        list.printList();
    }
}
