package partitionArrayForMaximumSum;

import java.util.Arrays;

public class PartitionArrayForMaximumSum {
    public static void main(String[] args) {
        int[] arr = new int[]{10,9,3,2};//{1,15,7,9,2,5,10};//{1,4,1,5,7,3,6,1,9,9,3}; {10,9,3,2}//
        int k=2;

        System.out.println("The sum is: "+maxSumAfterPartitioning(arr, k));

    }

    public static int maxSumAfterPartitioning(int[] arr, int k) {

        int n_elem = arr.length;
        int[] dp = new int[n_elem];
        dp[0]= arr[0];

        for (int i = 1; i < n_elem; i++) {
            System.out.println("----------------------------------");
            System.out.println("Processing "+arr[i]);
            dp[i] = dp[i-1] + arr[i];
            for (int j = 1; j <= k; j++) {
                System.out.println("k="+j);
                int prev_idx = i - j;
                int dp_i = 0;

                if (prev_idx<0){
                    int max_elem = arr[i];
                    for (int l = i; l >= 0; l--) {
                        if (arr[l]>max_elem){max_elem = arr[l];}
                    }
                    System.out.println("max_elem: "+max_elem);
                    dp_i = j*max_elem;
                    if (dp_i>dp[i]){dp[i]=dp_i;}
                    System.out.println("dp[i] = "+dp[i]);
                    break;

                } else if (j>1) {
                    int max_elem = arr[i];
                    for (int l = i; l >= i-j+1; l--) {
                        if (arr[l]>max_elem){max_elem = arr[l];}
                    }
                    System.out.println("max_elem: "+max_elem);
                    dp_i = dp[i-j] + j * max_elem;
                }
                else{ //j=1
                    dp_i = dp[0] + arr[j];
                }

                if (dp_i>dp[i]){dp[i]=dp_i;}
                System.out.println("dp[i] = "+dp[i]);
            }
        }
        return dp[n_elem-1];
    }
}
