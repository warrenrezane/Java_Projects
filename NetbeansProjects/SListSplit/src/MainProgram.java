/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Name of the User
 */
public class MainProgram {
    
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        LinkedList otherList = new LinkedList();
        
        System.out.println("Inserting 6 elements.....");
        for (int i=0;i<10;i++) {
            myList.addLast((i+1));
        }
        System.out.print("\nLinkedList properties: ");
        myList.printList();
        
        System.out.println("\nSplitting at 5.....");
        myList.splitAt(otherList, 5);
        
        System.out.print("List 1: ");
        myList.printList();
        System.out.print("\nList 2: ");
        otherList.printList();
        
        System.out.println("\nAdding 20 to both lists");
        myList.addLast(20);
        otherList.addLast(20);
        
        System.out.print("List 1: ");
        myList.printList();
        System.out.print("\nList 2: ");
        otherList.printList();
        
    }
}
