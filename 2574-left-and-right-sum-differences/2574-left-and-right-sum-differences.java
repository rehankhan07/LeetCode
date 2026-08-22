class Solution {
    public int[] leftRightDifference(int[] nums) {
    int[] leftsum=new int [nums.length];
    int[] rightsum=new int [nums.length];
    int[] res=new int [nums.length];
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
    leftsum[i] = sum;
    sum += nums[i];
    }
    sum = 0;
    for (int i =nums.length - 1; i >= 0; i--) {
    rightsum[i] = sum;
    sum += nums[i];
    }
    for(int i =0;i<res.length;i++){
        int t=leftsum[i]-rightsum[i];
        if(t<0){
            t*=-1;
        }
        res[i]=t;
        t=0;
    }
        return res;
    }
}