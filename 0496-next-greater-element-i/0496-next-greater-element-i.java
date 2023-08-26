class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num :nums2)
        {
            while(!stack.isEmpty() && num > stack.peek())
            {
                map.put(stack.pop(), num);
            }
            stack.add(num);
        }
        int i=0;
        for(int num : nums1)
        {
            ans[i++]=map.getOrDefault(num,-1);
        }
        return ans;
    }
}