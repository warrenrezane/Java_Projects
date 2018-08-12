/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListOfStack;

/**
 *
 * @author Name of the User
 */
public class Main {
    public static void main(String[] args) {
        LinkedList lists = new LinkedList();

        for (int i=0;i<3;i++) {
            Stack newStack = new Stack();
            lists.addStack(newStack);
        }
        
        lists.pushToStack(1, 5);
        lists.pushToStack(2, 2);
        lists.pushToStack(2, 6);
        lists.pushToStack(3, 1);
        lists.printStacks();
        
        int listpos = 2;
        
        System.out.println("Element " + lists.popToStack(listpos) + " is popped from Stack " + listpos + ". ");
        lists.printStacks();
    }
}
