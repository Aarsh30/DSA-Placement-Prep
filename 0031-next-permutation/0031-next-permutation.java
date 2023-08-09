class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        
        //step 1: breakpoint
        int ind =-1;
        
        for(int i= n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                ind = i;
                break;
            }
        }
        //if breakpoint doesn't come
        
        if(ind ==-1)
        {
            reverse(nums,0,n-1);     
            return;
      
        }

        //step 2:find the greater elements
        for(int i = n-1;i>ind;i--)
        {
            if(nums[i]>nums[ind])
            {
                int temp = nums[i];
                nums[i]= nums[ind];
                nums[ind]= temp;
                break;
            }
        }
        //step 3 reverse  the elements
        reverse(nums,ind+1,n-1);
    }
    private static void reverse(int nums[], int start, int end)
    {
        while(start<end)
        {
            int temp = nums[start];
            nums[start]= nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    }
}