class Solution {
    public String convertToTitle(int n) {
         String res = "";
    while(n != 0) {
        char ch = (char)((n - 1) % 26 + 65);
        n = (n - 1) / 26;
        res = ch + res;
    }
    return res;
}
    }
