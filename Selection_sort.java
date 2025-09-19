import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Selection_sort {
    public static void main(String[] args) {
          int[] arr = {-12, 45, 78, -23, 54};
        Selection_sort(arr);
    }
    
    public static void Selection_sort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
          int lastIndex = n-i-1;
          int max = getMax(arr, 0, lastIndex);
          swap(arr, lastIndex, max);
        }
        System.out.println(Arrays.toString(arr));
    }
    
    static int getMax(int[] arr,int start, int last){
        int max = 0;
        for(int i = 0; i <= last; i++){
           if(arr[max] < arr[i]){
               max = i;
           }  
        }
        return max;
    }
    
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
