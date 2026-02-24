class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int leftsum = 0;
        int totalsum =0;
        for(int x: nums){
            totalsum+=x;
        }
        int result[] = new int[nums.length];
        for(int i=0; i<n; i++){
            int rightsum = totalsum - leftsum - nums[i];
            int leftcount = i;
            int rightcount = n-1-i;
            int lefttotal = (leftcount * nums[i]) - leftsum;
            int righttotal = rightsum - (rightcount * nums[i]);
            result[i] = lefttotal + righttotal;
            leftsum+=nums[i];
          }       
        return result;
    }
}
// Formula:    for lefttotal = (count of left elements * current) - leftSum 
            //      righttotal =  rightSum - (count of right elements * current)