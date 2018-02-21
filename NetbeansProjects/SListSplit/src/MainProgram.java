/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Name of the User
 */
import java.util.Scanner;

public class MainProgram {
    
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        LinkedList otherList = new LinkedList();
        Scanner war = new Scanner(System.in);
        
        char decision = 'n';
        int data, opt;
        
        do {
            System.out.print("Enter number to add: ");
            data = war.nextInt();
            myList.addLast(data);
            System.out.print("Contents: ");
            myList.printList();
            System.out.print("\nAdd another number?(y/n): ");
            decision = war.next().charAt(0);
        } while (decision != 'n');
        
        System.out.print("\nSplit at: ");
        data = war.nextInt();
        
        myList.splitAt(otherList, data);
        System.out.print("List 1: \nContents: ");
        myList.printList();
        System.out.print("\nList 2: \nContents: ");
        otherList.printList();
        
        do {
            System.out.print("\nAdd data to which list?(1 or 2): ");
            opt = war.nextInt();
            switch (opt) {
                case 1:
                    do {
                        System.out.print("Enter number to add: ");
                        data = war.nextInt();
                        myList.addLast(data);
                        System.out.print("Contents: ");
                        myList.printList();
                        System.out.print("\nAdd another number?(y/n): ");
                        decision = war.next().charAt(0);
                    } while (decision != 'n');
                    break;
                    
                case 2: 
                    do {
                        System.out.print("Enter number to add: ");
                        data = war.nextInt();
                        otherList.addLast(data);
                        System.out.print("Contents: ");
                        otherList.printList();
                        System.out.print("\nAdd another number?(y/n): ");
                        decision = war.next().charAt(0);
                    } while (decision != 'n');
                    break;
                    
                default:
                    System.out.println("Invalid operation! ");
            }
        } while (opt < 2);
        
        
        
        
        
        
        
        
        
        
//        System.out.println("Inserting 10 elements.....");
//        for (int i=0;i<10;i++) {
//            myList.addLast((i+1));
//        }
//        System.out.print("\nLinkedList properties: ");
//        myList.printList();
//        
//        System.out.println("\nSplitting at 5.....");
//        myList.splitAt(otherList, 5);
//        
//        System.out.print("List 1: ");
//        myList.printList();
//        System.out.print("\nList 2: ");
//        otherList.printList();
//        
//        System.out.println("\nAdding 60 and 20 to lists");
//        myList.addLast(60);
//        otherList.addLast(20);
//        
//        System.out.print("List 1: ");
//        myList.printList();
//        System.out.print("\nList 2: ");
//        otherList.printList();

        
        
    }
}
