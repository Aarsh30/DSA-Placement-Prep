//{ Driver Code Starts
import java.util.*;
class Replace{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt();
		Solution g=new Solution();
		System.out.println(g.convertFive(n));
	}
}
}
// } Driver Code Ends


/*Complete the function below*/
class Solution{
	public static int convertFive(int n){
    //add code here.
    
      int r,res=0;
      int i=1;
      while(n>0)
      {
          r = n%10;
          if(r==0)
            {
                r=5;
            }
        res= res +r*i;
        i=i*10;
        n=n/10;
      }
      return res;
    }
}