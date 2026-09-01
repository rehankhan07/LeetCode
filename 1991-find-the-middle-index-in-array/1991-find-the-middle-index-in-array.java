class Solution {
    public int findMiddleIndex(int[] nums) {
       int pre=0;
       int post =0;
       int [] prefix = new int [nums.length];
       int [] postfix= new int [nums.length];
       for(int i =0;i<nums.length;i++){
        prefix[i]=pre;
        pre+=nums[i];
       }
       for(int i =nums.length-1;i>=0;i--){
        postfix[i]=post;
        post+=nums[i];
       }
        for(int i =0;i<nums.length;i++){
         if(prefix[i]==postfix[i]) return i;

       }

    return -1;
    }
}