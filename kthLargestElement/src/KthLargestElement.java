
public class KthLargestElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k=4;
        System.out.println(findkthLargestElement(nums, k));
    }
    public static int findkthLargestElement(int[] nums, int k){
        int length = nums.length;
        for (int i = 1; i <= k;  i++) {
            for (int j = length-1; j >=i; j--) {
                if(nums[j]>nums[j-1]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums[k-1];
    }
}
