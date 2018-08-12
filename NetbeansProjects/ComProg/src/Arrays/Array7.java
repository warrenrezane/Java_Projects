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
public class Array7 {
    public static void main(String[] args) {
        Scanner war = new Scanner(System.in);
        int row = 3;
        int col = 3;
        
        int[][] m = new int[row][col];
        
        for (int i=0;i<row;i++) {
//            System.out.print("Enter value for row " + (i+1) + ": (Separate by space) ");
            for (int j=0;j<col;j++) {
//                m[i][j] = war.nextInt();
                int rand = (int) Math.floor(Math.random() * 10);
                m[i][j] = rand;
            }
        }
        
        for (int[] i : m) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println("");
        }
        
        
        System.out.println("Determinant of 3x3: " + getDeterminant(m));
    }
    
    static void sort(int[][] m) {
        
    }
    
    
    
    static int getDeterminant(int[][] m) {
        int a = m[0][0] * (((m[1][1]) * (m[2][2])) - ((m[1][2]) * (m[2][1]))); // a(ei-fh)
        int b = m[0][1] * (((m[1][0]) * (m[2][2])) - ((m[1][2]) * (m[2][0]))); // b(di-fg)
        int c = m[0][2] * (((m[1][0]) * (m[2][1])) - ((m[1][1]) * (m[2][0]))); // c(dh-eg)
        
        return a - b + c;
    }
}