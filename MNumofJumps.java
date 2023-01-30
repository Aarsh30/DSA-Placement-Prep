//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class MNumofJumps
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
        // your code here
        int n = arr.length;
       
       if(n==1){      // size 1 no jumps
           return 0;
       }
       
       if(arr[0]==0){   // first step is zero no jump 
           return -1; 
       } 
       int jumps = 1;
       int  maxrange = arr[0];
       int steps = arr[0];
       
       for(int i=1;i<n;i++){
           
           // reached to the end
           if(i==n-1) return jumps;
           
           maxrange =Math.max(maxrange,i+arr[i]);
           steps--;
           
           // if no steps left
           
           if(steps==0){
               
               if(i>= maxrange) return -1;
               
               jumps++;
               steps = maxrange -i;
           }
       }
       return -1;
    }
}