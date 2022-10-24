import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        Arrays.stream(findErrorNums(nums)).forEach(System.out::println);
    }
    public static int[] findErrorNums(int[] nums) {
        int[] counters = new int[nums.length+1];
        int[] result = new int[2];
        for (int num : nums) {
            counters[num]++;
            if (counters[num] == 2) {
                result[0] = num;
            }

        }
        for(int k=1; k<counters.length;k++){
            if(counters[k]==0){
                result[1]=k;
                break;
            }
        }
        return result;
    }
}
