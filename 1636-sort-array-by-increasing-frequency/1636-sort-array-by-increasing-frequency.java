class Solution {
    public int[] frequencySort(int[] nums) {
        int[] freq = new int[201];
        for(int n:nums)
        {
            freq[n+100]++;
        }
        
        int index =0;
        while(index<nums.length)
        {
            int val =0;
            int min=Integer.MAX_VALUE;
            for(int j=0;j<freq.length;j++)
            {
                if(freq[j]<=min && freq[j]>0)
                {
                    val = j;
                    min = freq[j];
                }
            }
            
            while(freq[val]>0)
            {
                nums[index]=val-100;
                index++;
                freq[val]--;
            }
        }
        return nums;
    }
}