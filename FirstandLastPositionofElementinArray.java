class FirstandLastPositionofElementinArray {
    public int[] searchRange(int[] nums, int target) {

  int ans []= {-1,-1};

    int start =0;
    int end = nums.length -1;
  
    while(start<= end)
     {
            int mid = start + (end - start)/2;
            if(target == nums[mid])
            {
                ans[0] = mid;
            }
            if(target>nums[mid])            {
                start = mid+1;            }
            else 
             end = mid -1;
            
            
    }          
      start =0;
     end = nums.length -1;
  
    while(start<= end)
     {
            int mid = start + (end - start)/2;

            if(target == nums[mid])
            {
                ans[1] = mid;
            }
            if(target>=nums[mid])
            {
                start = mid+1;
            }
            else 
               end = mid - 1;
            
            
    }              
    return ans;

  }
}