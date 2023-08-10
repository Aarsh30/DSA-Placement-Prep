class Solution {
    public int findDuplicate(int[] nums) {
        
    HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            if(!set.add(num)){
                return num;
            }
        }
    return nums.length;
}
}