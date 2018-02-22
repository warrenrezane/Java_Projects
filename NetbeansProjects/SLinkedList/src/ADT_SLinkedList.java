/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Name of the User
 */
public interface ADT_SLinkedList {
    
    public abstract void addFirst(Object item);
    public abstract void addLast(Object item);
    public abstract void insertAfter(Object item, Object key);
    public abstract void insertBefore(Object item, Object key);
    public abstract void printData();
    public abstract long getNodeSize();
    public abstract void search(Object item);
    public abstract boolean isFound(Object item);
    //public abstract boolean isDuplicate(Object item);
    public abstract void remove(Object item);
}
