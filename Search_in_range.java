/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Search_in_range {
    // in this we will search a number in a given range
    
    
        
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int target = 25;
        boolean result = false;
        
        if(!search(arr, 1, 3, target)){
            System.out.println("not found");
        } else {
            System.out.println("found");
        }
        
        
    }
    
    public static boolean search(int[] arr, int start, int end, int target){
        for(int i = start; i <= end ; i++){
           if(target == arr[i]){
               return true;
           } 
        }
        return false;
    }
    
    
}
