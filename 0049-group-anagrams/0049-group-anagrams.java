class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> m = new HashMap<>();
        for( String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if(!m.containsKey(key)){
                m.put(key, new ArrayList<>());
            }
            m.get(key).add(s);
        }
        return new ArrayList<>(m.values()); 
    }
}