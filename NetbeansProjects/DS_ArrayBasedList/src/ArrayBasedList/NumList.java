
package ArrayBasedList;

public class NumList extends ArrayList {
    
    int search;
    
    public NumList(){
        this.listSize = 0;
        this.numList = null;
        this.itemCount = 0;
    }
    
    public NumList(int listSize){
        createList(listSize);
    }
    
    @Override
    public void createList(int listSize){
        this.listSize = listSize;
        this.numList = new int[this.listSize];
        this.itemCount = 0;
        this.initElems();
    }
    
    public void initElems(){
        for(int x=0;x<this.getListSize();x++){
            this.numList[x] = -1; //denotes empty
        }
    }
    
    @Override
    public int getListSize(){
        return this.listSize;
    }
    
    @Override
    public void insert(int num){
        if(!isFull()){
            this.numList[this.itemCount] = num;
            this.itemCount++;
        }else{
            System.out.println("\nThe list is full.");
        } 
    }
    
    @Override
    public void clearList(){
        if(!isEmpty()){
            this.numList[this.itemCount - 1] = -1 ; //denotes empty
            this.itemCount--;
        }else{
            System.out.println("\nList is empty.");
        }
        
    }
    
    @Override
    public boolean isEmpty(){
        return (this.itemCount == 0);
    }
    
    @Override
    public boolean isFull(){
        return (this.itemCount == this.listSize);
    }
    
    @Override
    public void print(){
        for(int x=0;x<this.listSize;x++){
            if(this.numList[x] == -1){
                System.out.println("_ ");
            }else{
                System.out.println(this.numList[x] + " ");
            }
            
        }
    }

    @Override
    public void retrieveItem(int index) {
        if (index < this.listSize) {
            int num = this.numList[index];
            System.out.println("\nThe element is: " +num);
        }
        else {
            System.out.println("Number must be less than " + this.listSize);
        }
    }

    @Override
    public boolean searchItem(int fromArr) {
        for (int index = 0;index < this.numList.length;index++) {
            if (this.numList[index] == fromArr) {
                System.out.println("\n" + fromArr + " is found on the array list.");
                this.search = this.numList[index];
                return true;
            }
        }
        System.out.println(fromArr + " is not on the array list.");
        return false;
    }
    
    @Override
    public void replaceItem(int fromArr, int toReplace) {
        if (searchItem(fromArr)) {
            for (int index = 0; index < this.numList.length; index ++) {
                if (this.numList[index] == this.search) {
                    this.numList[index] = toReplace;
                    System.out.println("Therefore, changed to " + toReplace + ".");
                }
            }     
        }
        else {
            System.out.println(fromArr + " is not on the array list. Therefore, you cannot replace it." );
        }
    }
}
