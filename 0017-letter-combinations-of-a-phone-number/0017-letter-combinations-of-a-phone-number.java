class Solution {
     public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return ans;
        }

        String[] lettersMap = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(ans, new StringBuilder(), digits, lettersMap, 0);
        return ans;
    }

    public static void backtrack(List<String> res, StringBuilder sb, String digits, String[] lettersMap, int idx) {
        if (idx == digits.length()) {
            res.add(sb.toString());
            return;
        }

        int number = digits.charAt(idx) - '0';
        String numStr = lettersMap[number - 2];
        for (int i = 0; i < numStr.length(); i++) {
            sb.append(numStr.charAt(i));
            backtrack(res, sb, digits, lettersMap, idx + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}