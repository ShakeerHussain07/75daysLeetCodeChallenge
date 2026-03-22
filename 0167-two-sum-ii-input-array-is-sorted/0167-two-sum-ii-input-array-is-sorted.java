class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lpo=0;
      int rp=numbers.length-1;
      int[] result=new int[2];
      while(lpo<rp){
        if(numbers[lpo]+numbers[rp]==target){
         result[0]=lpo+1;
         result[1]=rp+1;
         return result;
        }
        else if(numbers[lpo]+numbers[rp]>target){
            rp--;
        }
        else if(numbers[lpo]+numbers[rp]<target){
            lpo++;
        }
      }
      return new int[0];
    }
}