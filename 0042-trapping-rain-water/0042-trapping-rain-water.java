class Solution {
    public int trap(int[] height) {
        int n = height.length;
        
        int waterTrapped =0;
        for(int i=0;i<n;i++)
        {
            int j=i;
            int leftMax=0,rightMax=0;
            while(j>=0)
            {
                leftMax =Math.max(leftMax,height[j]);
                j--;
            }
            j=i;
            while(j<n)
            {
                rightMax= Math.max(rightMax,height[j]);
                j++;
            }
            waterTrapped +=Math.min(rightMax,leftMax)-height[i];
        }
        return waterTrapped;
    }
}