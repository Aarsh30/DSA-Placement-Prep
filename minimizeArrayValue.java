class minimizeArrayValue {
    public int minimizeArrayValue(int[] nums) {
        
        long answer=0,prefixSum=0;

        for(int i=0;i<nums.length;i++)
        {
            prefixSum+=nums[i];
            answer = Math.max(answer,(prefixSum+i)/(i+1));
        }
        return (int)answer;
    }
}