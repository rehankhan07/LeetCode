class Solution {
    public int maxSubarraySumCircular(int[] nums) {
    int cumax=0;
    int maxsum=Integer.MIN_VALUE;

    int cumin=0;
    int minsum=Integer.MAX_VALUE;
    int total=0;
    for(int num:nums){
        cumax=Math.max(num,cumax+num);
        maxsum=Math.max(cumax,maxsum);

        cumin=Math.min(num,cumin+num);
        minsum=Math.min(cumin,minsum);
        total+=num;
    }
    if(maxsum<0) return maxsum;
    return Math.max(maxsum,total-minsum);
    }
}