/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Name of the User
 */
public class Array6 {
    public static void main(String[] args) {
        Scanner war = new Scanner(System.in);
        int row = 2;
        int col = 2;

        int a[][] = new int[row][col];
        
        for (int i=0;i<row;i++) {
            System.out.print("Enter value for row " + (i+1) + ": (Separate by space) ");
            for (int j=0;j<col;j++) {
                a[i][j] = war.nextInt();
            }
        }
       
        System.out.println("Determinant of 2x2 Matrix: " + getDeterminant(a));
    }
    
    static int getDeterminant(int[][] a) {
        return (a[0][0] * a[1][1]) - (a[0][1] * a[1][0]); // (a*d)-(b*c)
    }
}
