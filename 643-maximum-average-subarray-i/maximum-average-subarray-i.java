class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum =0;
        double max_avg =-Double.MAX_VALUE;
        
        for(int i=0; i<nums.length; i++){

          sum += nums[i];
          if ( i>= k-1){
             double avg = sum / k;
             max_avg = Math.max(max_avg , avg);
             sum -= nums[i-k+1];
          }          

        }

        return max_avg;
    }
}