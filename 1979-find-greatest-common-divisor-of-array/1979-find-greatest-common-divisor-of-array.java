class Solution {
    public int findGCD(int[] nums) {
        
        Arrays.sort(nums);
        int sma=nums[0];
        int lma=nums[nums.length-1];
       int res= findGCDIterative(sma,lma);
       return res;
    }
    public static int findGCDIterative(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
}