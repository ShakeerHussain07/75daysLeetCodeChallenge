class Solution {
    public int maxArea(int[] height) {
         int i=0,j=height.length-1;
        int a=0;
        while(i<j){
            a=Math.max(a,Math.min(height[i],height[j]) * (j-i));
            if(height[i]<height[j]) i++;
            else j--;
        }
        return a;
    }
}