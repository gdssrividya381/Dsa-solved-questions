import java.util.Arrays;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Search_in_2d_Array {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 45 ,78},
            {12, 29},
            {38, 47,30, 15}
        };
        int target = 15;
        
        int[] answer = search(arr, target);
        System.out.println(Arrays.toString(answer));
        
     
        
    }
        public static int[] search(int[][] arr, int target){
            for(int row = 0; row< arr.length; row++ ){
               for(int col = 0; col< arr[row].length; col++){
                   if(arr[row][col] == target){
                       return new int[] {row,col};
                   }
               }
               
            }
            return new int[] {-1,-1};
        
         } 
    
}
