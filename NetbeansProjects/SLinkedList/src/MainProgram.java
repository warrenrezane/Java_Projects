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
        
        DS_SLinkedList ds = new DS_SLinkedList();
        Scanner war = new Scanner(System.in);
        int opt = 0;
        
        char decision = 'n';
        Object item, key;
        
        
        do {
            printMenu();
            System.out.print("Enter choice: ");
            opt = war.nextInt();
            switch(opt) {
                case 1:
                        do {
                            System.out.print("\nEnter item to head node: ");
                            item = war.next();
//                            if (ds.isDuplicate(item)) {
//                                System.out.println("\n" + item + " is a duplicate. ");
//                            }
//                            else {
                                ds.addFirst(item);
                            //}
                            System.out.print("Do you wanna enter more items? (y/n)");
                            decision = war.next().charAt(0);
                        } while (decision != 'n');
                    break;
                    
                case 2:
                        do {
                            System.out.print("\nEnter item to tail node: ");
                            item = war.next();
                            ds.addLast(item);
                            System.out.print("Do you wanna enter more items? (y/n)");
                            decision = war.next().charAt(0);
                        } while (decision != 'n');
                    break;
                    
                case 3:
                    if (ds.getNodeSize() == 0) {
                        System.out.println("\nPut some values to the Node first. ");
                    }
                    else {
                        do {
                            System.out.print("\nEnter item before what key?: ");
                            key = war.next();
                            if (ds.isFound(key)) {
                                System.out.print("\nEnter item to add: ");
                                item = war.next();
//                                if (ds.isDuplicate(item)) {
//                                    System.out.println("\n" + item + " is a duplicate. ");
//                                }
//                                else {
                                    ds.insertBefore(item, key);
                                //}
                            }
                            else {
                                System.out.println("\nKey (Node object) not found. ");
                            }
                            
                            System.out.print("Do you wanna enter more items? (y/n)");
                            decision = war.next().charAt(0);
                        } while (decision != 'n');
                        
                    }
                    break;
                    
                case 4:
                    if (ds.getNodeSize() == 0) {
                        System.out.println("\nPut some values to the Node first. ");
                    }
                    else {
                        do {
                            System.out.print("\nEnter item after what key?: ");
                            key = war.next();
                            if (ds.isFound(key)) {
                                System.out.print("\nEnter item to add: ");
                                item = war.next();
//                                if (ds.isDuplicate(item)) {
//                                    System.out.println("\n" + item + " is a duplicate. ");
//                                }
//                                else {
                                    ds.insertAfter(item, key);
                                //}
                            }
                            else {
                                System.out.println("\nKey (Node object) not found. ");
                            }
                            System.out.print("Do you wanna enter more items? (y/n)");
                            decision = war.next().charAt(0);
                        } while (decision != 'n');
                    }
                    break;    
                    
                case 5:
                    if (ds.getNodeSize() == 0) {
                        System.out.println("\nPut some values to the Node first. ");
                    }
                    else {
                        ds.printData();
                    }
                    break;    
                    
                case 6:
                    if (ds.getNodeSize() == 0) {
                        
                    }
                    else {
                        do {
                        System.out.print("\nEnter item to search: ");
                            item = war.next();
                            ds.search(item);
                            System.out.print("Do you wanna search more items? (y/n)");
                            decision = war.next().charAt(0);
                        } while (decision != 'n');
                    }
                    break;
                    
                case 7:
                    if (ds.getNodeSize() == 0) {
                        
                    }
                    else {
                        do {
                        System.out.print("\nEnter item to remove: ");
                            item = war.next();
                            ds.remove(item);
                            System.out.print("Do you wanna remove more items? (y/n)");
                            decision = war.next().charAt(0);
                        } while (decision != 'n');
                    }
                    break;
                    
                case 8:
                    System.exit(0);
                    break;    
                  
                default:
                    System.out.println("\n\nThere's something wrong. ");
            }
        } while (opt != 8);
    }
    
    static void printMenu() {
        System.out.println("\n");
        System.out.println("[1]Add item on head node");
        System.out.println("[2]Add item on tail node");
        System.out.println("[3]Insert before on item");
        System.out.println("[4]Insert after on item");
        System.out.println("[5]Print node data");
        System.out.println("[6]Search node data");
        System.out.println("[7]Remove node");
        System.out.println("[8]Exit");
    }
}
