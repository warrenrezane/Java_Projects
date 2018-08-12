/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedLists;

import java.util.Scanner;
/**
 *
 * @author Name of the User
 */
public class LinkedList7 {
    public static void main(String[] args) {
        Scanner war = new Scanner(System.in);
        LinkArrayList list = new LinkArrayList();
        
        System.out.print("How many list?: ");
        int lists = war.nextInt();
        System.out.print("What size?: ");
        int size = war.nextInt();
        
        for (int i=0;i<lists;i++) {
            int[] data = new int[size];
            list.add(data);
        }
        
        
    }
}
