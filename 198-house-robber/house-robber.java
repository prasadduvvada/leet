class Solution {
    public int rob(int[] nums) {
    int n = nums.length;
     int dp[] = new int[nums.length+1];
     Arrays.fill(dp,-1);
    return f(n-1,dp,nums);
    }
 
    public int f(int n,int[]dp,int[]nums){
        if(n<0) return 0;
        if(n==0) return nums[n];
        if(dp[n] != -1) return dp[n];
        int robberyodd = nums[n] + f(n-2,dp,nums);
        int robbereven = f(n-1,dp,nums);
        return dp[n] = Math.max(robberyodd,robbereven);
    }
}