class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        // List<String> type = new ArrayList<>();
        // List<String> color = new ArrayList<>();
        // List<String> name = new ArrayList<>();
        int t = 0;
        String a = "type";
        if(ruleKey.equals("type")){
            for(int i=0;i<items.size();i++){
                // System.out.println(items.get(i).get(0));
                if(items.get(i).get(0).equals(ruleValue))
                    t++;
            }
        }
        else if(ruleKey.equals("color")){
            for(int i=0;i<items.size();i++){
                // System.out.println(items.get(i).get(1));
                if(items.get(i).get(1).equals(ruleValue))
                    t++;
            }
        }
        else if(ruleKey.equals("name")){
            for(int i=0;i<items.size();i++){
                // System.out.println(items.get(i).get(0));
                if(items.get(i).get(2).equals(ruleValue))
                    t++;
            }
        }
        return t;
    }
}