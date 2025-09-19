import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {12, 45, 78, 23, 54};
        Bubble_sort(arr);
    }
    
    public static void Bubble_sort(int[] arr){
        int n = arr.length;
        
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(arr));
    }
}
