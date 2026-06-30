class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int dp[][] = new int[m][n];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        return f(dp,m-1,n-1,obstacleGrid);
    }
    public int f(int [][]dp,int i,int j,int [][]obg){
        if(i<0 || j<0 || obg[i][j] == 1) return 0;
        if(i==0 && j==0) return 1;
        if(dp[i][j] != -1) return dp[i][j];
        int up = f(dp,i-1,j,obg);
        int left = f(dp,i,j-1,obg);
        return dp[i][j] = up + left;
    }
}