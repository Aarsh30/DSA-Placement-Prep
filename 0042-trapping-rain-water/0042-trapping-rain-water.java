class Solution {
    public static int trap(int height[]){
//     {
//         int n = height.length;
//         int left=0;
//         int leftmax=0;
//         int right = n-1;
//         int rightmax=0;
//         int res=0;

//         while(left<=right)
//         {
//             if(height[left]<=height[right])
//             {
//                 if(height[left]>=leftmax)
//                     leftmax = height[left];
//                 else
//                     res+=leftmax-height[left];

//                left++;
//             }
//             else{
//                 if(height[right]>=rightmax)
//                     rightmax = height[right];
//                 else
//                     res+=rightmax-height[right];

//               right--;
//             }

//         }
//         return res;
        
        
        int n = height.length;
    int leftmax[]= new int[n];
    int rightmax[] = new int[n];
    
    int ans =0;
    
    for(int i=1;i<n;i++)
    {
        leftmax[i] = Math.max(height[i-1], leftmax[i-1]);
    }
    for(int j = n-2;j >=0;j--)
    {
        rightmax[j] = Math.max(height[j+1], rightmax[j+1]);
    }
    
    
    for(int k=0;k<n;k++)
    {
        int waterLevel = Math.min(leftmax[k],rightmax[k]);
            if(waterLevel>= height[k])
                ans += waterLevel - height[k];
    }

    return ans;
    }


}