/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Arrays;

/**
 *
 * @author Name of the User
 */
public class Array3 {
    public static void main(String[] args) {
        int[][][] a = {
            {
                {1, 2, 3},
                {2, 3, 4}
            }
        };
        
        // Initializing 2d array
        for (int[][] array1 : a) {
            for (int[] array2 : array1) {
                for (int i : array2) {
                    System.out.println(i);
                }
            }
        }
        
        
        
        System.out.println(Arrays.deepToString(a));
    }
}
