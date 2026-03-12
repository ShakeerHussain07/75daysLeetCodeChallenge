class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> s=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int com=target-nums[i];
            if(s.containsKey(com)){
                return new int[] {s.get(com),i};

            }
            s.put(nums[i],i);
        }
        return new int[] {};
    }
}