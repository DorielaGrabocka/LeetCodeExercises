public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4,6};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int str = 0;
        int pos = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!= nums[str]){
                int temp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = temp;
                str++;
                pos++;
            }

        }
        return str+1;
    }
}

