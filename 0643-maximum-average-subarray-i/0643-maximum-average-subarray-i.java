class Solution {
    public double findMaxAverage(int[] nums, int k) {
     double maxavg=Integer.MIN_VALUE;
     double winavg=0;
    for(int i =0;i< k;i++){
        winavg+=nums[i];
    }
    winavg = winavg / k;
    maxavg = winavg;
    for(int i=k;i< nums.length;i++){
     winavg=( winavg*k-nums[i-k]+nums[i])/k;
     maxavg= Math.max(winavg,maxavg);
    }
    return maxavg;
    }
}