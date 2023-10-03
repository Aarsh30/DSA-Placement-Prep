//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String str = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.transform(str));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
   
       public String transform(String s) {
    int n = s.length();
    char[] chars = s.toCharArray(); // Convert the string to a character array

    if (Character.isLowerCase(chars[0])) {
        chars[0] = Character.toUpperCase(chars[0]);
    }

    for (int i = 1; i < n; i++) {
        if (chars[i - 1] == ' ') {
            chars[i] = Character.toUpperCase(chars[i]);
        }
    }

    return new String(chars); // Convert the character array back to a string and return
}

}