
package ArrayBasedList;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args){
        
        Scanner war = new Scanner(System.in);
        NumList nl = new NumList();
        
        int opt, limit;
        
        do {
            printMenu();
            opt = war.nextInt();
            switch(opt) {
                case 1:
                    if (nl.getListSize() != 0) {
                        System.out.println("\nYou must clear the list first. \n");
                    }
                    else {
                        System.out.print("\nEnter array list value: ");
                        limit = war.nextInt();
                        nl.createList(limit);
                    }
                    break;
                    
                case 2:
                    if (nl.getListSize() == 0) {
                        System.out.println("\nYou must create the list first. \n");
                    }
                    else if (nl.isFull()) {
                        System.out.println("\nList is full.");
                    }
                    else if (nl.isEmpty()) {
                        System.out.println("\nList is empty.");
                    }
                    else {
                        System.out.println("\nThe list is not empty nor full. \n");
                    }
                    break;
                
                case 3:
                    if (nl.getListSize() == 0) {
                        System.out.println("\nYou must create the list first. \n");
                    }
                    else {
                        System.out.println("\nList size is: " + nl.getListSize() + "\n");
                    }
                    break;
                    
                case 4:
                    if (nl.getListSize() == 0) {
                        System.out.println("\nYou must create the list first. \n");
                    }
                    else {
                        System.out.println("\nList cleared. \n");
                        nl.clearList();
                    }
                    break;
                    
                case 5:
                    if (nl.getListSize() == 0) {
                        System.out.println("\nYou must create the list first. \n");
                    }
                    else {
                        for(int x=0;x<nl.getListSize();x++){
                            int num;
                            System.out.println("Insert item " + x + ": ");
                            num = war.nextInt();
                            nl.insert(num);
                        }
                    }
                    break;
                    
                case 6:
                    if (nl.getListSize() == 0) {
                        System.out.println("\nYou must create the list first. \n");
                    }
                    else {
                        int num;
                        System.out.print("\nEnter element to retrieve: ");
                        num = war.nextInt();
                        nl.retrieveItem(num);
                    }
                    break;
                    
                case 7:
                    if (nl.getListSize() == 0) {
                        System.out.println("\nYou must create the list first. \n");
                    }
                    else {
                        int num;
                        System.out.print("\nEnter element to search in the list: ");
                        num = war.nextInt();
                        nl.searchItem(num);
                    }
                    break;
                    
                case 8:
                    if (nl.getListSize() == 0) {
                        System.out.println("\nYou must create the list first. \n");
                    }
                    else {
                        int num, replace;
                        System.out.print("\nEnter element to replace: ");
                        num = war.nextInt();
                        System.out.print("\nEnter element replace value: ");
                        replace = war.nextInt();
                        nl.replaceItem(num, replace);
                    }
                    break;
                    
                case 9:
                    if (nl.getListSize() == 0) {
                        System.out.println("\nYou must create the list first. \n");
                    }
                    else {
                        System.out.println("\nThe list contents are: ");
                        nl.print();
                    }
                    break;
                    
                case 10:
                    if (nl.getListSize() == 0) {
                        System.out.println("\nYou must create the list first. \n");
                    }
                    else {
                        nl = new NumList();
                        System.out.println("\nList size cleared. \n");
                    }
                    break;
                    
                    
                case 11:
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Invalid Input! ");
                    
            }
        } while (opt != 11);
            
        
        
//        /* Insertion */
//        System.out.println("\n---- Inserting Items... ----");
//        for(int x=0;x<nl.getListSize();x++){
//            nl.insert(x);
//        }
//        
//        System.out.println("\nThe list contents are: ");
//        nl.print();
        
//        /* Retrieval */
//        System.out.println("\n---- Retrieving an array element... ----");
//        nl.retrieveItem(11);
//        
//        /* Searching */
//        System.out.println("\n---- Searching for an array element... ----");
//        nl.searchItem(8);
//        
//        /* Replacing */
//        System.out.println("\n---- Replacing an array element... ----");
//        nl.replaceItem(3, 5);
//        
//        System.out.println("\nThe list contents are: ");
//        nl.print();
//        
//        /* Retrieving */
//        System.out.println("\n---- Retrieving an array element... ----");
//        nl.retrieveItem(6);
        
        /* Removal */
//        System.out.println("\n---- Deleting 10 Items... ----");
//        for(int x=0;x<nl.getListSize();x++){
//            nl.clearList();
//        }
//        
//        System.out.println("\nThe list contents are: ");
//        nl.print();
//        nl.clearList();// to check if isEmpty() works
    }
    
    static void printMenu() {
        System.out.println("");
        System.out.println("[1]Create array list");
        System.out.println("[2]Determine whether list is empty or full");
        System.out.println("[3]Identify the size of the list");
        System.out.println("[4]Clear the list");
        System.out.println("[5]Insert an item in the list");
        System.out.println("[6]Retrieve an item from the list");
        System.out.println("[7]Search an item from the list");
        System.out.println("[8]Replace an item at the specified location");
        System.out.println("[9]Print list");
        System.out.println("[10]Clear list size");
        System.out.println("[11]Exit");
        System.out.println("");
    }
}
