/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Even_digit_Numbers {
   public static void main(String[] args){
    int[] nums = {12, 345, 12, 6, 7896 };
    findNumbers(nums);
    }

    public static int findNumbers(int[] nums) {
        int count=0;
        
        for (int i = 0; i< nums.length; i++){
            if(nums[i] % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
        return 0;
    }
    
}
