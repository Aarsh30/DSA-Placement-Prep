class DesignBrowserHistory {
int current;
ArrayList<String> history;
    public BrowserHistory(String homepage) {
        this.history = new ArrayList<>();
        history.add(homepage);
        this.current =0;

    }
    
    public void visit(String url) {
        while(history.size()-1 > current)
        {
            history.remove(history.size()-1);
        }
           history.add(url);
           ++current;         
    }
    
    public String back(int steps) {
        if(steps>current) current =0;
        else
        current-=steps;
        return history.get(current);
    }
    
    public String forward(int steps) {
        if(steps+current>=history.size()) current = history.size()-1;
        else current+=steps;
        return history.get(current);
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */