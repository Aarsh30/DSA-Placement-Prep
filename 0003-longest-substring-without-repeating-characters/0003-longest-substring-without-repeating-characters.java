class Solution {
    public int lengthOfLongestSubstring(String s) {
  
	// trying all possible substring
	int max = 0;

	for (int i = 0; i < s.length(); i++) {

		Set<Character> set = new HashSet<>();
		set.add(s.charAt(i));

		for (int j = i + 1; j < s.length(); j++) {
			if (!set.contains(s.charAt(j)))
				set.add(s.charAt(j));
			else
				break;
		}
		max = Math.max(max, set.size());
	}
	return max;
}
}