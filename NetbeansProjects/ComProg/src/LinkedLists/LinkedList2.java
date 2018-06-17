/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedLists;

/**
 *
 * @author Name of the User
 */

// DIFFERENTIATING ODD AND EVEN INTEGERS USING LINKED LIST

import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<Integer> oddList = new LinkedList<>();
        LinkedList<Integer> evenList = new LinkedList<>();
        
        for (int i=0;i<10;i++) {
            if (i % 2 == 0) {
                evenList.add(i+1);
            }
            else {
                oddList.add(i+1);
            }
        }
        
        System.out.println("Even List");
        evenList.stream().forEach((i) -> {
            System.out.print(i + " ");
        });
        
        System.out.println("\n");
        
        System.out.println("Odd List");
        oddList.stream().forEach((i) -> {
            System.out.print(i + " ");
        });
    }
}
