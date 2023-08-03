//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String str = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.ReverseSort(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String ReverseSort(String str) 
    { 
        // code here
        
        char ch[] = str.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        
        for(char c :ch)
        {
            list.add(c);
        }
        Collections.sort(list,Collections.reverseOrder());
        
        char[] sorted = new char[list.size()];
        for(int i=0;i<list.size();i++)
        {
            sorted[i]=list.get(i);
        }
        String res = String.valueOf(sorted);
        return res;
    }
} 