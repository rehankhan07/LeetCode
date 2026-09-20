class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int  min= Integer.MAX_VALUE;
       int curr=0;
       int low=0,high=0;
       while(high<nums.length){
        curr+=nums[high];
        high++;
        while(curr>=target){
          int cu=high-low;
           min= Math.min(cu,min);
            curr-=nums[low];
            low++;
        }
       
       }
       return min==Integer.MAX_VALUE?0:min;
    }
}