class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        findBrackets("(",1,0,list,n);
        return list;
        
    }
    
    public void findBrackets(String current, int o , int c , List<String> list, int n )
    {
        if(current.length() == 2*n)
        {
            list.add(current);
            return;
        }
        
        if(o<n) findBrackets(current + "(",o+1,c,list, n);
        if(c<o) findBrackets(current + ")",o,c+1,list,n);
    }
    }