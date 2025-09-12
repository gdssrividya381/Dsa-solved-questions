import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Smallest_letter_greater_than_target {
    
   public static void main(String[] args) {
        
        char[] arr = {'a', 'c', 'd', 'f', 'k', 'x', 'z'};
      
        System.out.println("elements of array are " + Arrays.toString(arr) );
        char target = 'b';
        int result = Binary_search(arr, 0, 6, target);
            
            System.out.println("ceiling of "+ target +" is " + arr[result]); 
        
        
        
        
    }
    
    public static int Binary_search(char[] arr, int low, int high, char target){
        
        
        while(low <= high){
            int mid = (low+high)/2 ;
        if(arr[mid] == target){
            return mid;
        
        } else if( arr[mid] > target){
           high = mid-1;
           
        } else {
           low = mid+1;
          
        }
        
        }
        
       return low;
}
    
    
}
