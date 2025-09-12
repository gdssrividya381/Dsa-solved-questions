
import java.util.Arrays;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Peak_index_in_mountain_array {
    
           public static void main(String[] args) {
        
        int[] arr = {0, 10, 5, 2};
                   //0, 1, 2, 3, 4
        
        System.out.println("elements of array " + Arrays.toString(arr) );
       
        int result = Binary_search(arr);
        
            System.out.println("peak element is: "+ arr[result]);
        
        
        
        
        
    }
    
    public static int Binary_search(int[] arr){
        int low = 0;
        int high = arr.length-1;
        
      while (low < high) {
            int mid = low + (high - low)/2;
        if (arr[mid] < arr[mid+1]) {
             low = mid + 1;   
        } else {
             high = mid;    
        }
     }
     return low; 
    }
    
}
