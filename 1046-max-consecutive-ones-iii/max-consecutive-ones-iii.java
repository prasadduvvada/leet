class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen =0,left =0,right =0,zeros =0;
        while(right<nums.length){
            if(nums[right] == 0){
                   zeros++;
            }
            while(zeros > k){
                if(nums[left] == 0){
                    zeros--;
                }
                left++;
            }
            int len = right - left +1;
            maxlen = Math.max(len,maxlen);
            right++;
        }
        return maxlen;
    }
}