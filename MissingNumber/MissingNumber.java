package MissingNumber;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = { 0};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        boolean[] isPresent = new boolean[nums.length+1];

        for (int num: nums) {
            isPresent[num] = true;
        }

        for (int i = 0; i < isPresent.length; i++) {
            if(!isPresent[i]) return i;
        }

        return -1;
    }
}
