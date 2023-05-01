class Solution {
    public int climbStairs(int n) {
        if(n<=2)
        return n;

        int one =1;
        int two =2;
        for(int i=3;i<=n;i++)
        {
            int temp =one;
            one = two;
            two += temp;
        }
        return two;
    }
}