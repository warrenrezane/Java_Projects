/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hybrids;

/**
 *
 * @author Name of the User
 */
public class ArrayList extends LinkedList {
    
    LinkedList nodeList[];
    int listSize;

    public ArrayList() {
        
    }
    
    public ArrayList(int listSize) {
        createList(listSize);
    }
    
    public void createList(int listSize) {
        this.listSize = listSize;
        this.nodeList = new LinkedList[this.listSize];
        this.initializeList();
    }
    
    public void initializeList() {
        for (int i=0;i<this.getListSize();i++) {
            this.nodeList[i] = null;
        }
    }

    public void insert(int listnum, LinkedList list) {
        this.nodeList[listnum] = list;
    }
    
    public void addToList(int listnum, int data) {
        this.nodeList[listnum].add(data);
    }
    
    public void printLinkedList(int listnum) {
        this.nodeList[listnum].printList();
    }
    
    public void removeToList(int listnum, int key) {
        this.nodeList[listnum].remove(key);
    }
    
    public void clearList(int listnum) {
        this.nodeList[listnum] = null;
    }
    
    public int getListSize() {
        return this.listSize;
    }
    
    public void printArrayList(){
        for(int x=0;x<this.listSize;x++){
            if(this.nodeList[x] == null){
                System.out.println("_ ");
            }else{
                this.nodeList[x].printList();
                System.out.println(" ");
            }
            
        }
    }
    
}
