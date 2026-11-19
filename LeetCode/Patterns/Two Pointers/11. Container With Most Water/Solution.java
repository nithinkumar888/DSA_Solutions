class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j =height.length-1;
        int maxWater=0;
        while (i<j) 
        {
            int width=j-i;
            int currentHeight=Math.min(height[i],height[j]);
            maxWater=Math.max(maxWater,width*currentHeight);
            if (height[i] < height[j]) 
            {
                i++;
            } else {
                j--;
            }
        }
        return maxWater;
    }
}