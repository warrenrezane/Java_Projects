
package ArrayBasedList;

public class MainProgram {
    public static void main(String[] args){
        NumList nl = new NumList();
        nl.createList(10);
        
        /* Insertion */
        System.out.println("\n---- Inserting 10 Items... ----");
        for(int x=0;x<nl.getListSize();x++){
            nl.insert(x);
        }
        
        System.out.println("\nThe list contents are: ");
        nl.print();
        
        /* Retrieval */
        System.out.println("\n---- Retrieving an array element... ----");
        nl.retrieveItem(11);
        
        /* Searching */
        System.out.println("\n---- Searching for an array element... ----");
        nl.searchItem(8);
        
        /* Replacing */
        System.out.println("\n---- Replacing an array element... ----");
        nl.replaceItem(3, 5);
        
        System.out.println("\nThe list contents are: ");
        nl.print();
        
        /* Retrieving */
        System.out.println("\n---- Retrieving an array element... ----");
        nl.retrieveItem(6);
        
        /* Removal */
        System.out.println("\n---- Deleting 10 Items... ----");
        for(int x=0;x<nl.getListSize();x++){
            nl.clearList();
        }
        
        System.out.println("\nThe list contents are: ");
        nl.print();
        nl.clearList();// to check if isEmpty() works
    }
}
