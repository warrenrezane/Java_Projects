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

// THIS PROGRAM IS TRAVERSING A 2D ARRAY

public class Array1 {
    public static void main(String[] args) {
//        int[][] a = {
//            {1, 2, 3}, {4, 5, 6},
//            {7, 8, 9}, {10, 11, 12}
//        };

        int[][] a = new int[5][5];
        
        // Initializing 2d array
        for (int i=0;i<a.length;i++) {
            for (int j=0;j<a[i].length;j++) {
                a[i][j] = i + j;
            }
        }
        
        // Easy version of for loop
        for (int i=0;i<a.length;i++) {
            for (int j=0;j<a[i].length;j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("\n");
        }
        
        System.out.println("\n");
        System.out.println("\n");
        
        // Enhanced for loop but has the same functionality as above
        for (int[] i : a) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println("\n");
        }
        
        System.out.println("\n");
        System.out.println("\n");
        
        // printing array in a different way
        System.out.println(Arrays.deepToString(a));
    }
}
