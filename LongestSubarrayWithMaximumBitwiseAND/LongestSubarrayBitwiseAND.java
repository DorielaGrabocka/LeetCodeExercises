package LongestSubarrayWithMaximumBitwiseAND;

import java.util.Arrays;

public class LongestSubarrayBitwiseAND {
    public static void main(String[] args) {
        int[] nums ={378034,378034,378034};
        System.out.println(longestSubarray(nums));
    }

    public static int longestSubarray(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int k = 1;
        int current_length = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==max){
                System.out.println("nums[i]="+nums[i]);
                current_length++;
            }
            else{
               k = Math.max(k, current_length);
               current_length = 0;
            }
        }
        k = Math.max(k, current_length);
        return k;
    }
}
