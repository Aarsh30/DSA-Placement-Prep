public class Solution {
    public String decodeAtIndex(String s, int k) {
        long size = 0;
        int n = s.length();

        // Calculate the size of the decoded string
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(s.charAt(i))) {
                size *= s.charAt(i) - '0';
            } else {
                size++;
            }
        }

        // Start decoding from the end of the string
        for (int i = n - 1; i >= 0; i--) {
            k = (int)(k % size);

            if (k == 0 && Character.isLetter(s.charAt(i))) {
                return String.valueOf(s.charAt(i));
            }

            if (Character.isDigit(s.charAt(i))) {
                size /= s.charAt(i) - '0';
            } else {
                size--;
            }
        }

        return "";
    }
}