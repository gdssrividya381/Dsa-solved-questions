
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Insertion_sort {
    public static void main(String[] args) {
          int[] arr = {12, 45, 78, 23, 54};
        Insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    
    static void Insertion_sort(int[] arr){
        for(int i = 0; i< arr.length -1; i++){
            for(int j = i+1; j > 0; j-- ){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
        
    }
    
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
