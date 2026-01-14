class Solution {
    public int[] leftRightDifference(int[] nums) {
     int i=0;
     int left_sum =0;
     int total_sum = 0; 
     for(int x:nums){
       total_sum+=x;
     }
     int result[] = new int[nums.length]; 
     while(i<nums.length){
       int right_sum = total_sum-left_sum-nums[i]; 
        result[i] = Math.abs(left_sum - right_sum);
        left_sum+=nums[i++];
     }
     return result;
    }
}