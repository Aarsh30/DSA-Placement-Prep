//{ Driver Code Starts
import java.util.*;


class Implement_strstr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String a = line.split(" ")[0];
			String b = line.split(" ")[1];
			
			GfG g = new GfG();
			System.out.println(g.strstr(a,b));
			
			t--;
		}
	}
}
// } Driver Code Ends


class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       // Your code here
       int m = x.length();
       int n=s.length();
       for(int i=0;i<=n-m;i++)
       {
           int j;
           for(j=0;j<m;j++)
           {
               if(x.charAt(j)!=s.charAt(i+j))
                {break;}
           }
           if(j==m)
             {
                 return i;
             }
       }
       return -1;
    }
}
