import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Binary_search {
    public static void main(String[] args) {
        
        int[] arr = {3, 2, 9, 1, 7};
        System.out.println("elements of array are " + Arrays.toString(arr));
        sort(arr);
        System.out.println("elements of array after sorting are " + Arrays.toString(arr) );
        int target = 2;
        if(Binary_search(arr, 0, 4, target)){
            System.out.println("element found");
        } else {
            System.out.println("element not found");

        } 
        
        
        
        
    }
    
    public static boolean Binary_search(int[] arr, int low, int high, int target){
        
        
        while(low <= high){
            int mid = (low+high)/2 ;
        if(arr[mid] == target){
            return true;
        
        } else if( arr[mid] > target){
           high = mid-1;
           
        } else {
           low = mid+1;
          
        }
        
        }
        
       return false;
}
    
    public static void sort(int[] a){
        for(int j=0; j< a.length - 1; j++){
            for(int i=0; i<a.length -j -1; i++){
            //arranging in asscending order
            if(a[i]> a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
            }
        }
    }
    
}