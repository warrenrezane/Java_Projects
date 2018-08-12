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
public class Array9 {
    public static void main(String[] args) {
        Scanner war = new Scanner(System.in);
        int[][] m;
        int[] oneD;
        int row, col, count = 0;
        
        System.out.print("Enter rows: ");
        row = war.nextInt();
        System.out.print("Enter columns: ");
        col = war.nextInt();
        
        m = new int[row][col];
        
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                int rand = (int) Math.floor(Math.random() * 20);
                m[i][j] = rand;
                count++;
            }
        }
        
        oneD = new int[count];
        
        System.out.println("\nUnsorted 2D Array: \n");
        
        for (int[] i : m) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.print("\n");
        }
        
        System.out.println("\nSorted 2D Array: \n");
        
        count = 0;
        
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                oneD[count] = m[i][j];
                count++;
            }
        }
        
        for (int i=0;i<oneD.length;i++) {
            for (int j=i+1;j<oneD.length;j++) {
                if (oneD[i] > oneD[j]) {
                    int temp = oneD[i];
                    oneD[i] = oneD[j];
                    oneD[j] = temp;
                }
            }
        }
        
        count = 0;
        
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                m[i][j] = oneD[count];
                count++;
            }
        }
        
        for (int[] i : m) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.print("\n");
        }
        
    }
}
