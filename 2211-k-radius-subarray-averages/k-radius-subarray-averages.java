class Solution {
    public int[] getAverages(int[] nums, int k) {
        int radius[] = new int[nums.length];
        for(int x=0; x<nums.length; x++){
            radius[x] = -1;
        }
        int window = 2*k+1;
        long current_window_sum =0;
        if(nums.length < window){
            return radius;
        }
        for(int i=0; i<window; i++){
            current_window_sum += nums[i];
        }
        radius[k] = (int)(current_window_sum / window);
        for(int i = k+1; i < nums.length -k ; i++ ){
            current_window_sum = current_window_sum - nums[i-k-1] + nums[i+k];
            radius[i] = (int)(current_window_sum / window);
        }
        return radius;
    }
}