//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class ArmstrongNumber {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
       
       int temp = n;
       int sum=0,rev=0;;
       while(n!=0)
       {
           
           int lastdigit=n%10;
           sum=sum + (lastdigit  * lastdigit * lastdigit);
         n=n/10;
       }
       if(sum == temp)
       return "Yes";
       else return "No";
       
    }
}