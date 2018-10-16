/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author TheNineInwKung
 */
public class Input {
    
    public static boolean checkSpace(String ...input){
       for(String data : input){
           if(data==""||data==null)
               return false;
       }
       return true;
    }
}
