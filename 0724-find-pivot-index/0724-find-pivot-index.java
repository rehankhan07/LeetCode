class Solution {
    public int pivotIndex(int[] nums) {
    int [] pre = new int [nums.length];
    int [] suff= new int [nums.length];
    int pr=0;
    for(int i=0;i<nums.length;i++){
       pre[i]=pr;
       pr += nums[i];
    }
    int suf=0;
     for(int i=nums.length-1;i>=0;i--){
       suff[i]=suf;
       suf += nums[i];
    }
    for(int i=0;i<nums.length;i++){
        if(pre[i]==suff[i]) return i;

    }
    return -1;     
    }
}