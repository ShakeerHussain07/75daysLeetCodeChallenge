class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> st = new HashSet<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i++) {
            int low = i+1;
            int high = nums.length-1;
            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum > 0) {
                    high--;
                } else if(sum < 0) {
                    low++;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[low]);
                    temp.add(nums[high]);
                    low++;
                    Collections.sort(temp);
                    st.add(temp);
                }
            }
        }
        
        return new ArrayList<>(st);

    }
}