/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hybrids;

import java.util.Scanner;
/**
 *
 * @author Name of the User
 */
public class Main {
    public static void main(String[] args) {
        Scanner war = new Scanner(System.in);
        ArrayList lists;
        int listCount, data, listmod, arrMenu, listMenu;
        char maindec = 0;
        char subdec;
        
        System.out.print("How many lists? ");
        listCount = war.nextInt();
        lists = new ArrayList(listCount);
        
        for (int i=0;i<listCount;i++) {
            LinkedList list = new LinkedList();
            lists.insert(i, list);
        }
        
        System.out.println(lists.getListSize() + " list(s) has been created. ");
        do {
            ArrayMenu();
            arrMenu = war.nextInt();

            switch (arrMenu) {
                case 1:
                    System.out.print("List to modify: ");
                    listmod = war.nextInt();
                    do {
                        ListMenu();
                        listMenu = war.nextInt();


                        switch (listMenu) {
                            case 1:
                                do {
                                    System.out.println("");
                                    System.out.print("Enter data to list: ");
                                    data = war.nextInt();
                                    lists.addToList(listmod - 1, data);
                                    System.out.print("Add more data? (y/n)");
                                    subdec = war.next().charAt(0);
                                } while (subdec != 'n');
                                break;
                                
                            case 2:
                                break;
                                
                            case 3:
                                lists.printLinkedList(listmod-1);
                                break;
                                
                            case 4:
                                
                                break;
                                
                        }
                    } while (maindec != 'n');
                    break;
                    
                case 2: 
                    System.out.print("Enter list to clear:  ");
                    listmod = war.nextInt();
                    lists.clearList(listmod - 1);
                    
                    break;
                    
                case 3:
                    System.out.println("");
                    lists.printArrayList();
                    
                    break;
                    
                case 4:
                    System.exit(0);
            }
            
        } while (maindec != 'n');
    }
    
    static void ArrayMenu() {
        System.out.println("");
        System.out.println("----- MAIN MENU -----");
        System.out.println("[1] Modify Lists");
        System.out.println("[2] Clear Lists");
        System.out.println("[3] Print Lists");
        System.out.println("[4] Exit");
        System.out.print("Enter choice: ");
    }
    
    static void ListMenu() {
        System.out.println("");
        System.out.println("----- SUB MENU -----");
        System.out.println("[1] Add data to list");
        System.out.println("[2] Remove data to list");
        System.out.println("[3] Print list");
        System.out.println("[4] Sort list");
        System.out.println("[5] Back to main menu");
        System.out.print("Enter choice: ");
    }
    
}
