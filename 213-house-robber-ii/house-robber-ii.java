class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0],nums[1]); 
        int []dp1 = new int[n];
        Arrays.fill(dp1,-1);
        int rob = f(dp1,nums,n-2,0);

        int []dp2 = new int[n];
        Arrays.fill(dp2,-1);
        int skip = f(dp2,nums,n-1,1);
         return Math.max(rob,skip);
    }
    public int f(int[]dp,int[]nums,int range,int start){

          if(range < start) return 0;
          if(dp[range] != -1) return dp[range];
          int rob = nums[range] + f(dp,nums,range-2,start);
          int skip = f(dp,nums,range-1,start);
          return dp[range] = Math.max(rob,skip);
    }
}