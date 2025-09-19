import java.util.Arrays;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Rotated_array {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 7, 8, 9, 1};
        
       // System.out.println(arr[Peaks(arr)]);
       int result = find_target(arr, 1);
        if(result == -1){
            System.out.println("element not found");
        } else {
            System.out.println("element found at "+ result);

        } 
    }
    
    
    
    public static int Peaks(int[] arr){
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            int mid = (low+high)/2;
            
            if(arr[mid] > arr[mid+1]){
                return mid;
             } else if(arr[mid] < arr[mid-1]){
                return mid;
            } else if(arr[low]> arr[mid]){
                high = mid -1;
            } else {
                low = mid;
            }
            
            
               
        }     
    return 0;    
    }
    
    public static int find_target(int[] arr, int target){
        int peak = Peaks(arr);
        int found = 0;
        if(found == 0){
            int low = 0;
            int high = peak;
            while(low<=high){
             
                int mid = (low+high)/2 ;
                if(arr[mid] == target){
                    found = 1;
                     return mid;
        
                } else if( arr[mid] > target){
                     high = mid-1;
           
                } else {
                    low = mid+1;
          
                }
        
            }
        
                
        }
        
        if(found == 0){
            int low = peak+1;
            int high = arr.length;
            while(low<=high){
             
                int mid = (low+high)/2 ;
                if(arr[mid] == target){
                    found = 1;
                     return mid;
        
                } else if( arr[mid] > target){
                     high = mid-1;
           
                } else {
                    low = mid+1;
          
                }
        
            }
        
                
        }
        
     return -1; 
        
       
    }
}
