//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Function to swap characters in the given array
    public static void swap(char[] arr, int i, int j)
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to reverse the input string
    public static String reverseWord(String str)
    {
        char[] str1 = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while (start <= end)
        {
            swap(str1, start, end);
            start++;
            end--;
        }
        String s = String.valueOf(str1);
        return s;
    }
}
