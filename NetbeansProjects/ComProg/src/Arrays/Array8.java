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
public class Array8 {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int sum = 0, avg = 0, count = 0;
        
        System.out.print("Total sum of array elements: ");
        for (int[] i : m) {
            for (int j : i) {
                sum+= j;
            }
        }
        System.out.print(sum + "\n");
        System.out.print("Total average of array elements: ");
        
        for (int[] i: m) {
            for (int j : i) {
                count++;
            }
        }
        
        avg = sum / count;
        
        System.out.print(avg + "\n");
    }
}
