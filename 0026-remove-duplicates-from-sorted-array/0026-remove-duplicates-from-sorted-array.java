class Solution {
    public int removeDuplicates(int[] nums) {
        int i,max=nums[0],kount=1;
        for (i = 1; i < nums.length; i++) {
        if (nums[i] != nums[i-1]) {  
            nums[kount] = nums[i];  
            kount++;  
        }
    }
    return kount;
    }
}