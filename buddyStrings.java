class Solution {
    public boolean buddyStrings(String s, String goal) {
        int c =0;
        if(s.length()!=goal.length()) return false;

        Set<Character> s1 = new HashSet();
        Set<Character> s2 = new HashSet();
        Set<Character> set = new HashSet();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=goal.charAt(i))
            {
                s1.add(s.charAt(i));
                s2.add(goal.charAt(i));
                c++;
            }
            set.add(s.charAt(i));
        }

        if(c==2 && s1.equals(s2)) return true;
        if(c==0 && set.size()!=s.length()) return true;
        return false;
    }
}