import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class First_and_last_position_of_elements {
    
     public static void main(String[] args) {
        
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
      
        System.out.println("elements of array are " + Arrays.toString(arr) );
        int target = 7;
        int[] result = Binary_search(arr, 0, arr.length -1, target);
            
            System.out.println("first and last position in sorted array " + Arrays.toString(result)); 
        
        
        
        
    }
     
     
      public static int[] Binary_search(int[] arr, int low, int high, int target){
        int start, last;
        
        while(low <= high){
            int mid = (low+high)/2 ;
        if(arr[mid] == target){
            start = mid;
            last = mid;
            while(mid > 0 && arr[mid-1] == target){
                start = mid - 1;
                mid--;
            }
            
            while(mid < arr.length && arr[mid+1] == target){
                last = mid+1;
                mid++;
            }
            return new int[]{start, last};
        
        } else if( arr[mid] > target){
           high = mid-1;
           
        } else {
           low = mid+1;
          
        }
        
        }
        
       return  new int[]{-1,-1};
}
    
}
