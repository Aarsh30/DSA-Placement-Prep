class Solution {
    public String mergeAlternately(String word1, String word2) {

   String word3;

        int n1 = word1.length();
        int n2 = word2.length();
        int n;
        StringBuilder result = new StringBuilder();
        int i=0,j=0;
        while(i<n1 || j<n2)
        {
            if(i<n1)
            result.append(word1.charAt(i++));
            if(j<n2)
            result.append(word2.charAt(j++));
        }
   return result.toString();

    }
}