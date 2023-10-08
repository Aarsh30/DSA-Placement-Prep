//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends



class Solution
{
    static final int CHAR = 256;
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        
        int max = Integer.MIN_VALUE;
        int cnt[] = new int[CHAR];
        char ch ='\u0000';
        
        for(int i=0;i<line.length();i++)
        {
            cnt[line.charAt(i)]++;
        }
        for(int i=0;i<CHAR;i++)
        {
            if(cnt[i]>max)
            {
                max= cnt[i];
                ch= (char)i;
            }
        }
        return ch;
    }
    
}