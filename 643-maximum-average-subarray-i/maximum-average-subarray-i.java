class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum =0;
        double max_avg =-Double.MAX_VALUE;
        for(int i =0; i<nums.length; i++){
         sum+=nums[i];
         if(i>=k){
            sum-=nums[i-k];
        }
            if(i >= k-1){
           double avg = sum/k;
            max_avg = Math.max(avg,max_avg);
        }
        }
        return max_avg;
    }
}