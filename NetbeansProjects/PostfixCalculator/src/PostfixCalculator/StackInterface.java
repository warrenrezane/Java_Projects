/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostfixCalculator;

/**
 *
 * @author Name of the User
 */
public interface StackInterface {
    public int pop();
    public boolean isEmpty();
    public void push(int elem);
    public int peek();
    public void clear();
}
