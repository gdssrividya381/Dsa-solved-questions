
import java.util.Arrays;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Linear_Search {
  public static void main(String[] args) {
    String name = "Srividya";
    char target = 'i';
    boolean result = false;
      System.out.println(Arrays.toString(name.toCharArray()));
    if(Linear_search(name, target)){
            System.out.println("character found");
    } else {
        System.out.println("charater not found");
    }
    }
    public static boolean Linear_search(String name, char target){
        if(name.length() == 0){
            System.out.println("name is invalid");
            return false;
        }
        
        for(int i=0; i< name.length(); i++){
            if(target == name.charAt(i)){
                return true;
            }
           
        }
         return false;
    }
   
}
