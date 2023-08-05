class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x == '(' || x == '[' || x == '{')
                s.push(x);
            else {
                if (s.isEmpty())
                    return false;
                else if (!matching(s.peek(), x))
                    return false;
                else
                    s.pop();
            }
        }
        return s.isEmpty();
    }
    private boolean matching(char a, char b) {
        return (a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}');
    }
}