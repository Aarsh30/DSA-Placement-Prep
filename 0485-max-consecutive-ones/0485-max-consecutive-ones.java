class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
//         int max=0;
//     for(int i=0;i<nums.length;i++)
//     { 
//         int flag=0;
//     for(int j=i;j<nums.length;j++)  
//         {
//         if(nums[j]==1)
//                 flag=flag+1;
//          else
//             break;
//          }
//         if(flag>max)
//         max = flag;
//     }
//         return max;

    
    
    
    int max=0;
    int cnt=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                cnt++;
            }
            else
            {
                cnt=0;
            }   
        max = Math.max(cnt,max);
        }
        return max;      
    }
}