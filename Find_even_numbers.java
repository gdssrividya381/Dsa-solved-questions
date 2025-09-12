import java.util.Arrays;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Find_even_numbers {
    public static void main(String[] args) {
        int[] arr = {12, 345, 20, 6, 7896};
        int count = 0;
        
        
         for(int i = 0; i< arr.length; i++){
             if(even(arr[i])){
                 count ++;
             }
         }
         System.out.println(" Number of even digit numbers are " + count);
    }
    
    public static boolean even(int n){
      int result = 0;
      while(n > 0){
          result++;
          n/=10;
      }
      if(result % 2 == 0){
          return true;
      }
      return false;
    }
}
