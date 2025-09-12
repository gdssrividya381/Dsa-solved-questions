/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Max_in_2d_array {
    public static void main(String[] args) {
        
        int[][] arr = {
            {23, 45 ,78},
            {12, 29},
            {38, 47,30, 15}
        };
        
        int max = arr[0][0];
        
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
              if(arr[row][col] > max){
                  max = arr[row][col];
              }  
            }
        }
        
        System.out.println("maximum is "+ max);
        
    }
    
}
