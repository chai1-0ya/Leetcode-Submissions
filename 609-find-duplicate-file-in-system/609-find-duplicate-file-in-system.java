class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> s = new ArrayList<List<String>>();
        for(String a : paths){
            List<String> list = Arrays.asList(a.split(" "));
            s.add(list);
        }
        HashMap<String, List<String>> ss = new HashMap<>();
        for(List<String> list : s){
            for(int i=1;i<list.size();i++){
                String b = list.get(0);
                String c = list.get(i);
                List<String> ls = new ArrayList<>();
                ls.add(b+"/"+c.substring(0,c.indexOf("(")));
                c = c.substring(c.indexOf("(")+1,c.indexOf(")"));
                if(ss.containsKey(c)){
                    List<String> x = new ArrayList<>();
                    x = ss.get(c);
                    x.addAll(ls);
                    ss.put(c, x);
                }
                else {
                    ss.put(c, ls);
                }
            }
            System.out.println(list);
        }
        List<List<String>> y = new ArrayList<List<String>>();
        for (List<String> z : ss.values()){
            if(z.size()>1)
                y.add(z);
        }
        return y;
    }
}