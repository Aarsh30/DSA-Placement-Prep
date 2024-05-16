class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int n : nums)
        {
            if(hash.contains(n))
            {
                return true;
            }
            hash.add(n);
        }
        return false;
    }
}