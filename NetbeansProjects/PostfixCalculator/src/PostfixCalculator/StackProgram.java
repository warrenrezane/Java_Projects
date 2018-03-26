/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostfixCalculator;

import java.util.Scanner;
/**
 *
 * @author Name of the User
 */
public class StackProgram {
    
    static StackClass stack = new StackClass();
    
    public static void main(String[] args) {
        Scanner war = new Scanner(System.in);
        
        String exp = " ";
        char getChar;
        int elements;
        
        
        System.out.print("Enter postfix expression: ");
        exp = war.nextLine();
        
        String[] ans = exp.split(" ");
        
        for (int i=0;i<ans.length;i++) {
            getChar = ans[i].charAt(0);
            if ((getChar != '+') && (getChar != '-') && (getChar != '/') && (getChar != '*')) {
                elements = Integer.parseInt(ans[i]);
                stack.push(elements);
            }
            else {
                checkCharacter(getChar);
            }
        }
        
        System.out.println("Calculated postfix expression: " + stack.pop());
    }
    
    static void checkCharacter(char getChar) {
        
        
        switch(getChar) {
                case '+':
                    int add_1 = stack.pop();
                    int add_2 = stack.pop();
                    int sum = add_2 + add_1;
                    stack.push(sum);
                    break;
                    
                case '-':
                    int minus_1 = stack.pop();
                    int minus_2 = stack.pop();
                    int difference = minus_2 - minus_1;
                    stack.push(difference);
                    break;
                        
                case '/':
                    int divide_1 = stack.pop();
                    int divide_2 = stack.pop();
                    int quotient = divide_2 / divide_1;
                    stack.push(quotient);
                    break;
                        
                case '*':
                    int times_1 = stack.pop();
                    int times_2 = stack.pop();
                    int product = times_2 * times_1;
                    stack.push(product);
                    break;    
            }
    }
}
