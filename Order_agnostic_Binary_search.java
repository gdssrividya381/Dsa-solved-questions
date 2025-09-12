

import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Order_agnostic_Binary_search {
    
     public static void main(String[] args) {
        //elements must be ein ascending order
        int[] arr = {1, 2,  3 , 4, 5};
        
        System.out.println("elements of array are " + Arrays.toString(arr) );
        int target = 9;
        if(Binary_search(arr, 0, 4, target)){
            System.out.println("element found");
        } else {
            System.out.println("element not found");

        } 
        
        
        
        
    }
     
        public static boolean Binary_search(int[] arr, int start, int end, int target){
        
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = (start+end)/2 ;
             if(arr[mid] == target){
            return true;
        
        } 
        
           
       if(isAsc){
       if( arr[mid] > target){
           end = mid-1;
           
        } else {
           start = mid+1;
          
        }
        } else {
            if( arr[mid] < target){
           start = mid+1;
           
        } else {
           end = mid-1;
          
        }
        }
      }  
       return false;
}
    
}
