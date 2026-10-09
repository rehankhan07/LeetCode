class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            int dum =0;
            for(int j=i;j<nums.length;j++){
               dum+=nums[j];
                if(dum==goal) count++;
            }
           
        }
        return count;
    }
}