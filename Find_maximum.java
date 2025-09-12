/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Find_maximum {
  public static void main(String[] args) {
        
    
    int[] arr = {67, 45, 78, 34, 68, 23, 89, 12, 6, 3, 90, 58};
    int max = arr[0];
    for(int i = 1; i< arr.length; i++){
        if(arr[i]>max){
            max = arr[i];
            
        }
    }
    
        System.out.println("maximum value in the array is " + max);
    
  }
}

    

