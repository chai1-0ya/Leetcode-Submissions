class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> li = new ArrayList<>();
        Map<Integer,Integer> hp = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            int key = nums[i];
            if(hp.containsKey(key))
            {
                int freq = hp.get(key);
                freq++;
                hp.put(key, freq);
            }
            else
            {
                hp.put(key, 1);
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(hp.containsKey(i) == false)
                li.add(i);
        }
        return li;
    }
}