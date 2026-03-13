class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> m=new HashSet<>();
        for(int num : nums){
            if(!m.add(num)){
                return  true;
            }
        }
        return false;
    }
}