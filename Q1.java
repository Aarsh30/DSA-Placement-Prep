import java.util.*;

public class TCS{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("available pencils (N): ");
        int N = sc.nextInt();
        System.out.println("available erasers (M): ");
        int M = sc.nextInt();
        System.out.println(" pencils to be bought (P): ");
        int P = sc.nextInt();
        System.out.println(" to be bought (E): ");
        int E = sc.nextInt();
        
        long ways = nCr(N, P) * nCr(M, E);
        System.out.println("The number of ways to choose " + P + " pencils and " + E + " erasers from " + N + " pencils and " + M + " erasers is: " + ways);
    }
    
  public static long nCr(int n, int r) {
        if (n < r) return 0;
        if (r == 0 || r == n) return 1;
        return nCr(n - 1, r - 1) + nCr(n - 1, r);
    }
}
