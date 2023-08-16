class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
//      HashSet<List<Integer>> set = new HashSet<>();
        
//         for(int i=0;i<nums.length;i++)
//         {
//             for(int j =i+1;j<nums.length;j++)
//             {
//                 for(int k = j+1;k<nums.length;k++)
//                 {
//                     if(nums[i]+nums[j]+nums[k]==0)
//                     {
//                         List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
//                         temp.sort(null);
//                         set.add(temp);
//                     }
//                 }
//             }
//         }
        
//         List<List<Integer>> ans = new ArrayList<>(set);
//         return ans;
//     }
        
     int n = nums.length;
        
    HashSet<List<Integer>> st = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            HashSet<Integer> hashset = new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                int third = -(nums[i]+nums[j]);
                if(hashset.contains(third))
                {
                 List<Integer> temp = Arrays.asList(nums[i],nums[j],third);
                temp.sort(null);
                st.add(temp);
                }
            hashset.add(nums[j]);
            }
            
        }
        
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
        
        
    }
}