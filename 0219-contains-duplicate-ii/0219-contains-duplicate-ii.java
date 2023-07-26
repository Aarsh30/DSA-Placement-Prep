// class Solution {
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
	
// 	for (int i = 0; i < nums.length; i++) {
// 		for (int j = i + 1; j <= i + k && j < nums.length; j++) {
// 			if (nums[i] == nums[j]) 
// 				return true;
// 		}
// 	}

// 	return false;
// }
// }

class Solution
{
    public boolean containsNearbyDuplicate(int[] nums, int k) {
	Set<Integer> set = new HashSet<Integer>();
	
	for(int i = 0; i < nums.length; i++) {
		if (i > k) 
			set.remove(nums[i-k-1]); 
		
		if (!set.add(nums[i])) 
			return true; 
	}
	
	return false;
}
}