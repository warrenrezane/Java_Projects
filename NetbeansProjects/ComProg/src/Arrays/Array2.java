/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Name of the User
 */

// DIFFERENTIATING ODD AND EVEN INTEGERS USING ARRAY

public class Array2 {
    public static void main(String[] args) {
        int odd[] = new int[5];
        int even[] = new int[5];
        
        int oddInd = 0;
        int evenInd = 0;
        
        for (int i=0;i<10;i++) {
            if (i % 2 == 0) {
                even[evenInd] = i;
                evenInd++;
            }
            else {
                odd[oddInd] = i;
                oddInd++;
            }
        }
        
        System.out.println("Even array");
        for (int i : even) {
            System.out.print(i + " ");
        }
        
        System.out.println("\n");
        
        System.out.println("Odd array");
        for (int i : odd) {
            System.out.print(i + " ");
        }
    }
}
