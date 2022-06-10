public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] heights = {2,3,4,5,18,17,6};
        System.out.println(maxArea(heights));
    }
    public static int maxArea(int[] height){
        int maxArea = 0;
        int numOfElements = height.length;
        int left = 0; //left boundary
        int right = numOfElements-1; //right boundary
        for(int i=0; i<numOfElements; i++){
            int width = right - left;
            int minHeight = height[right]<height[left] ? height[right] : height[left]; //find minimum heigh
            int area = width*minHeight;
            if(area>maxArea)
                maxArea = area;

            if(minHeight == height[right]){
                right = right-1; //this goes on the left
            }
            else{//minimum is in left boundary
                left = left+1; //this goes on the right
            }
        }
        return maxArea;
    }
}
