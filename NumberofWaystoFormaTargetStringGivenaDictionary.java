class Solution {
    int alphabet = 26;
    int mod = 1000000007;
    int cnt[][];
    long dp[][];

    long f(String target, int i, int j) {
        if (j == 0) {
            return i == 0 ? 1 : 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        dp[i][j] = f(target, i, j - 1);
        if (i > 0) {
            dp[i][j] += cnt[target.charAt(i - 1) - 'a'][j - 1] * f(target, i - 1, j - 1);
        }
        dp[i][j] %= mod;
        return dp[i][j];
    }
    
    public int numWays(String[] words, String target) {
        int m = target.length(), k = words[0].length();
        cnt = new int[alphabet][k];
        for (int j = 0; j < k; j++) {
            for (String word : words) {
                cnt[word.charAt(j) - 'a'][j]++;
            }
        }
        dp = new long[m + 1][k + 1];
        for (int i = 0; i <= m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return (int)f(target, m, k);
    }
}