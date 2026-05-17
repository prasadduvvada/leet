class Solution {
    public int minCostClimbingStairs(int[] cost) {
     int n = cost.length;
     int dp[] = new int[cost.length+1];
     Arrays.fill(dp,-1);
    return Math.min(f(n-1,dp,cost),f(n-2,dp,cost));
    }

    public int f(int n, int[]dp, int[]cost){
        if(n<=1) return cost[n];
        if(dp[n] != -1) return dp[n];
        int left = f(n-1,dp,cost);
        int right = f(n-2,dp,cost);
        return dp[n] = cost[n] + Math.min(left , right);
    }
}