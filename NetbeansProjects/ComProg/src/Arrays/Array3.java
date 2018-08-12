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
public class Array3 {
    public static void main(String[] args) {
        int[][][] m = new int[3][3][3];
        int oneD[] = new int[27];
        
        // Initialize 3D Array
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                for (int c=0;c<3;c++) {
                    int rand = (int) Math.floor(Math.random() * 20);
                    m[i][j][c] = rand;
                }
            }
        }
        
        print3D(m);
        
        System.out.println("");
        
        oneD = convertTo1D(m, oneD);
        sort1D(oneD);
        
        System.out.println("");
        
        m = convertTo3D(oneD, m);
        print3D(m);
        
        
    }
    
    static void sort1D(int[] oneD) {
        for (int i=0;i<oneD.length;i++) {
            for (int j=i+1;j<oneD.length;j++) {
                if (oneD[i] > oneD[j]) {
                    int temp = oneD[i];
                    oneD[i] = oneD[j];
                    oneD[j] = temp;
                }
            }
        }
    }
    
    static int[][][] convertTo3D(int[] oneD, int[][][] m) {
        int count = 0;
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                for (int c=0;c<3;c++) {
                    m[i][j][c] = oneD[count];
                    count++;
                }
            }
        }
        return m;
    }
    
    static int[] convertTo1D(int[][][] m, int[] oneD) {
        int count = 0;
        for (int[][] i : m) {
            for (int[] j : i) {
                for (int c : j) {
                    oneD[count] = c;
                    count++;
                }
            }
        }
        return oneD;
    }
    
    static void print3D(int[][][] m) {
        for (int[][] i : m) {
            for (int[] j : i) {
                for (int c : j) {
                    System.out.print(c + "\t");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
    
    static void print1D(int[] oneD) {
        for (int i : oneD) {
            System.out.print(i + " ");
        }
    }
}
