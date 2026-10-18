class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return Math.min( min(cost,n-1,dp), min(cost,n-2,dp));
    }
     public int min(int[] cost, int ind,int [] dp) {
      if(ind==0 || ind==1) return cost[ind];
      if(dp[ind] != -1) return dp[ind];
      return dp[ind]=cost[ind]+Math.min(min(cost, ind-1 , dp) , min(cost,ind-2,dp));
    }
}