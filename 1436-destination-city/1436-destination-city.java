class Solution {
    public String destCity(List<List<String>> paths) {
        for (int i = 0; i < paths.size(); i++) {
            String candidate = paths.get(i).get(1);
            boolean good = true;
            
            for (int j = 0; j < paths.size(); j++) {
                if (paths.get(j).get(0).equals(candidate)) {
                    good = false;
                    break;
                }
            }

            if (good) {
                return candidate;
            }
        }
        
        return "";
    }
}