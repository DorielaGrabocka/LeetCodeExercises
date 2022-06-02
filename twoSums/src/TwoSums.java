import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSums {
    public static void main(String[] args) {
        int[] array = {3,4,3};
        int target = 6;

        int[] index = twoSum(array, target);
        Arrays.stream(index).forEach(i-> System.out.println(i));

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
        int[] positionArray = {-1,-1};
        for (int i=0;i < nums.length; i++) {
            int position = i;
            int value1 = nums[i];
            int value2 = target - value1;

            if(numbersMap.containsKey(value2)) {
                int value2Position = numbersMap.get(value2);;
                if (value1 == value2 && i == value2Position) {
                    continue;
                }
                else{
                    return new int[] {value2Position, i};
                }
            }
            else{
                numbersMap.put(nums[i],i);
            }
        }
        return positionArray;
    }
}
