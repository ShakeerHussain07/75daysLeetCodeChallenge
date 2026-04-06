class Solution {
    public int findMin(int[] nums) {
         int n = nums.length;
        int left = 0;
        int right = n-1;
        int a = Integer.MAX_VALUE;
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(nums[left] <= nums[mid]) {
                a = Math.min(a, nums[left]);
                left = mid + 1;
            } else {
                a = Math.min(a, nums[mid]);
                right = mid - 1;
            }
        }
        return a;
    }
}