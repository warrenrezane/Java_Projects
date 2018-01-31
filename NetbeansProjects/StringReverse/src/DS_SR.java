
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Name of the User
 */
public class DS_SR extends ADT_SR{

    public DS_SR() {
        this.str = "";
    }
    
    public DS_SR(String str) {
        stringReverse(str);
    }
    
    //abstract method implementation
    @Override
    public String stringReverse(String str) {
        //Gi split ang str by " "
        //Ug ma store sa temp array
        String[] temp = str.split(" ");
        String result = "";
        
        //Gi loop ang temp array and 
        //gi store ang string in reverse order
        for (int i = 0;i < temp.length; i++) {
            if (i == temp.length - 1) {
                result = temp[i] + result;
            }
            else
                result = " " + temp[i] + result;
            }
        return result;
   }
}
