public class WiggleSubsequence {
    public static void main(String[] args) {
        int[] array = {3,3,3,2,5};
        System.out.println(wiggleMaxLength(array));
    }
//    public static int wiggleMaxLength(int[] nums) {
//        int lengthOfSubsequence = 1;
//        if(nums.length==1 || isMonotonic(nums)) return 1;
//        else{
//            boolean isNegative = nums[0]>nums[1];
//            int leftPointer=1;
//            int rightPointer=2;
//            for (int i = 1; i < nums.length-1; i++) {
//                if(nums[leftPointer]>nums[rightPointer]){
//                    if(!isNegative){
//                        isNegative = true;
//                        if(rightPointer == nums.length-1) lengthOfSubsequence+=1;
//                        lengthOfSubsequence+=1;
//                        leftPointer=rightPointer;
//                        rightPointer+=1;
//                    }
//                    else{//not complying
//                        rightPointer +=1;
//                    }
//                }
//                else{//case when the difference is positive
//                    if(isNegative){
//                        isNegative = false;
//                        if(rightPointer == nums.length-1) lengthOfSubsequence+=1;
//                        lengthOfSubsequence+=1;
//                        leftPointer = rightPointer;
//                        rightPointer+=1;
//                    }
//                    else{
//                        rightPointer+=1;
//                    }
//                }
//            }
//        }
//        return lengthOfSubsequence;
//    }
    private static boolean isMonotonic(int[] array){
        boolean isMonotonic = true;
        for (int i = 1; i < array.length; i++) {
            if(array[i]!=array[i-1])
                return false;
        }
        return isMonotonic;

    }

    public static  int wiggleMaxLength(int[] nums){
        if(nums == null || nums.length==0)
            return 0;
        if(nums.length<2){
            return nums.length;
        }

        int count=1;


        for(int i=1, j=0; i<nums.length; j=i, i++){
            if(nums[j]<nums[i]){
                count++;
                while(i<nums.length-1 && nums[i]<=nums[i+1]){
                    i++;
                }
            }else if(nums[j]>nums[i]){
                count++;
                while(i<nums.length-1 && nums[i]>=nums[i+1]){
                    i++;
                }
            }
        }

        return count;
    }
}
