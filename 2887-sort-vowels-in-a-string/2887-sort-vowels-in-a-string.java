class Solution {
    public String sortVowels(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int[] vowels = new int[n];
        int vowelCount = 0;
        for (int i = 0; i < n; i++) {
            char c = chars[i];
            if (isVowel(c)) {
                vowels[vowelCount++] = c;
                chars[i] = ' ';
            }
        }
        Arrays.sort(vowels, 0, vowelCount);
        int vowelIndex = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] == ' ') {
                chars[i] = (char) vowels[vowelIndex++];
            }
        }
        return new String(chars);
    }
    
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
