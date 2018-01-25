
package ArrayBasedList;

public abstract class ArrayList {
    
    /* List Properties */
    protected int listSize;
    protected int itemCount;
    protected int numList[];
    
    /* List Operations */
    public abstract void createList(int capacity);
    public abstract int getListSize();
    public abstract void insert(int n);
    public abstract void clearList();
    public abstract boolean isFull();
    public abstract boolean isEmpty();
    public abstract void print();
    public abstract void retrieveItem(int num);
    public abstract boolean searchItem(int fromArr);
    public abstract void replaceItem(int fromArr, int toReplace);
}
