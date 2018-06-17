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
public class Array4 {
    public static void main(String[] args) {
        int a[] = new int[10];
        
        for (int i=0;i<a.length;i++) {
            int rand = (int) Math.floor(Math.random() * 20);
            a[i] = rand;
        }
        
        System.out.print("Un-ordered: ");
        
        for (int i : a) {
            System.out.print(i + " ");
        }
        
        for (int i=0;i<a.length;i++) {
            for (int j=i+1;j<a.length;j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        System.out.print("\nIn-ordered: ");
        
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
