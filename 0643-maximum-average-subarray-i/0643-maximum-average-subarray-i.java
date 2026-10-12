class Solution {
    public double findMaxAverage(int[] nums, int k) {
    double sum=0;
    double maxsum=Integer.MIN_VALUE;
    for(int i=0;i<k;i++){
        sum+=nums[i];
    }
    sum=sum/k;
    maxsum=Math.max(sum,maxsum);
    for(int i=k;i<nums.length;i++){
        sum= sum *k- nums[i-k]+ nums[i];
        sum/=k;
       maxsum=Math.max(sum,maxsum);
    }
    return maxsum;
    }
}