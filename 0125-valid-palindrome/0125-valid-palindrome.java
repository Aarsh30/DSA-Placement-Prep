class Solution {
    public boolean isPalindrome(String s) {
         String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
         int n  =str.length()-1;
      return isPalindromeCheck(str,0,n);
    }
    
    public boolean isPalindromeCheck(String str, int start, int end)
    {
        if(start>=end)
        {
            return true;
        }
        return (str.charAt(start)==str.charAt(end)) && isPalindromeCheck(str, start +1 , end -1);
    }
}