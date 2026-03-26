class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double avg=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        avg=sum/k;
        int d=0;
        for(int i=k;i<nums.length;i++){
            sum = sum+nums[i]-nums[d++];
            double cur=sum/k;
            avg=Math.max(avg,cur);
        }
        return avg;
    }
}