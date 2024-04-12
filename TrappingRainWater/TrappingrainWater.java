package TrappingRainWater;

public class TrappingrainWater {
    public static void main(String[] args) {
        int[] height = {0,0,0,1};
        //{4,2,0,3,2,5};//{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));

    }

    public static int trap(int[] height) {
        int water = 0;
        int n_elem = height.length;
        // find left maximums for each element
        int[] left_max = new int[n_elem];
        //find right maximums for each element
        int[] rigth_max = new int[n_elem];
        //find minimum max for each position
        left_max[0] = height[0];
        left_max[1] = height[0];
        for (int i = 2; i < n_elem; i++) {
            left_max[i] = Math.max(left_max[i-1], height[i-1]);
        }
        rigth_max[n_elem-1] = height[n_elem-1];
        rigth_max[n_elem-2] = height[n_elem-1];
        for (int i = n_elem-3; i >=0 ; i--) {
            rigth_max[i] = Math.max(rigth_max[i+1], height[i+1]);
        }
        //subtract heights at each position with minimum being 0
        //add everything
        for (int i = 0; i < n_elem; i++) {
            water += Math.max(0, Math.min(rigth_max[i], left_max[i])-height[i]);
        }

        return water;

    }
}
