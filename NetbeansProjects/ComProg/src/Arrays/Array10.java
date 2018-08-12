/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author Name of the User
 */
public class Array10 {
    public static void main(String[] args) {
        Scanner war = new Scanner(System.in);
        int[][] m;
        int row, col, count = 0;
        
        System.out.print("Enter rows: ");
        row = war.nextInt();
        System.out.print("Enter columns: ");
        col = war.nextInt();
        
        m = new int[row][col];
        
        for (int[] i : m) {
            for (int j : i) {
                check(row, col, count);
                count++;
            }
            System.out.print("\n");
            
        }
    }
    
    static void check(int row, int col, int count) {
        if (isOdd(row, col) && row == col) {
            if (count == ((row * col) / 2)) {
                System.out.print("  ");
            }
            else {
                System.out.print('-' + " ");
            }
        }
        else {
            System.out.print('-' + " ");
        }
    }
    
    static boolean isOdd(int row, int col) {
        return !(row % 2 == 0) && !(col % 2 == 0);
        
    }
    
    
}
