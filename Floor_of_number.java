import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Floor_of_number {
    
       public static void main(String[] args) {
        
    
       int[] arr = {2, 3, 5, 6, 10, 12};
        
        System.out.println("elements of array  " + Arrays.toString(arr));
        int target = 7;
        int result = Floor(arr, 0, 5, target);
          
          
        if(result == -1){
            System.out.println("ceiling doesnot exist");
         } else {    
            System.out.println("ceiling of " + target +" is " + result);
         } 
        
    }
       public static int Floor(int[] arr, int low, int high, int target){
        
        if(target < arr[low]){
            return -1;
        }
        
        while(low <= high){
            int mid = (low+high)/2 ;
        if(arr[mid] == target){
            return arr[mid];
        
        } else if( arr[mid] > target){
           high = mid-1;
           
        } else {
           low = mid+1;
          
        }
        
        }
      
     
       return arr[high];
}
 
    
}
