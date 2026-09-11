class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int start=0,end=0,pro=1,count=0,n=nums.length;
        while(end<n){
        pro*=nums[end];
        while(pro>=k){
            pro/=nums[start];
            start++;
        }
        count = count+(end-start+1);
        end++;
        }
       return count;
    }
}