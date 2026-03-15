class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> t=new HashSet<>();
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            t.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(!t.contains(i)){
                li.add(i);
            }
        }
        return li;
    }
}