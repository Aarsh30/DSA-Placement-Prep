class Solution {
   public boolean isPalin(String s,int start, int end)
    {
            if(start>=end)
             return true;
            
            return (s.charAt(start) == s.charAt(end)) && isPalin(s,start+1,end-1);
   }
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int n = str.length()-1;
        return isPalin(str,0,n);
        
    }
}