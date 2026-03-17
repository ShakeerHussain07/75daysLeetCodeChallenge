class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        
        List<Integer> l = new ArrayList<>(map.keySet());
        
        Collections.sort(l,(a,b)->map.get(b)-map.get(a));
        
        int[] res = new int[k];
        
        for(int i=0;i<k;i++){
            res[i] = l.get(i);
        }
        
        return res;
    }
}