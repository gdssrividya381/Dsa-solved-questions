/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Ceiling_of_Number {
    public static void main(String[] args) {
        
   
    int[] arr = {2, 3, 5, 6, 10, 12};
    
   int target = 11;
   ceiling(arr, target);
   
    }
    
    public static void ceiling(int[] arr, int target){
        boolean found = false;
        
        for(int i = 0; i< arr.length -1; i++){
            if(arr[i] == target){
                System.out.println("celing of the number is "+ arr[i]);
                found = true;
            }
    
        }
        if(!found){
            int i = 0;
       
            while(arr[i] < target){
                i++;
                if(arr[i] > target){
                    System.out.println("ceiling of the number is "+ arr[i]);
                }
            }
        }
    }
    
}
