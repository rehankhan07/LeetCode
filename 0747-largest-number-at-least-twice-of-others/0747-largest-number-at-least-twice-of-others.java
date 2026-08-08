class Solution {
    public int dominantIndex(int[] nums) {
     int max =Integer. MIN_VALUE ;
     int maxi= 0;
       for(int i=0;i<nums.length;i++){
       if(nums[i]>max){
        max=nums[i];
        maxi=i;
        }
      }
     //looop kkhtm
     for(int i=0;i<nums.length;i++){
       if(nums[i]==max) continue;
       else{
        if(max<2*nums[i]) return -1;
       }
     }


    return maxi;
    }
}