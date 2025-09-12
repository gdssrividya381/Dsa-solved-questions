import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Find_position_of_element {
    
       public static void main(String[] args) {
        
        int[] arr = {1, 4, 6, 8, 9};
                   //0, 1, 2, 3, 4
        
        System.out.println("elements of array " + Arrays.toString(arr) );
        int target = 4;
        int result = Binary_search(arr, target);
        if(result == -1){
            System.out.println("element not found");
        } else {
            System.out.println("element found at "+ result);
        }
        
        
        
        
    }
    
    public static int Binary_search(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        
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
        
       return -1;
}
    
}
