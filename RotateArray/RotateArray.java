package RotateArray;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7}, 3);
    }

    public static void rotate(int[] nums, int k){
        if (k%nums.length==0){
            System.out.print(nums);
        }
        else{
            int[] rotated_array = new int[nums.length];
            for(int i=0; i<nums.length; i++){
                int new_pos = (i+k)%nums.length;
                rotated_array[new_pos] = nums[i];
            }
            Arrays.stream(rotated_array).forEach(System.out::print);
        }
    }
}
