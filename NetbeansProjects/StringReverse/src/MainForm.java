/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Name of the User
 */

import java.util.Scanner;

public class MainForm {
    public static void main(String[] args) {
        
        //Putting it to test! :)
        Scanner war = new Scanner(System.in);
        DS_SR ds_sr = new DS_SR();
        String str;
        
        System.out.print("Enter String(s) to reverse: ");
        str = war.nextLine();
        
        System.out.println("Output: " + ds_sr.stringReverse(str));
    }
}
