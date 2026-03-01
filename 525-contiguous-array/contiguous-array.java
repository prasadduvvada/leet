class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        
        int[] freq = new int[2 * n + 1];
        
        // Initialize with -2 (means not visited)
        for(int i = 0; i < freq.length; i++){
            freq[i] = -2;
        }
        
        int sum = 0;
        int maxLength = 0;
        int offset = n;  // shift index to avoid negative
        
        freq[offset] = -1;  // base case
        
        for(int i = 0; i < n; i++){
            
            sum += (nums[i] == 0) ? -1 : 1;
            
            if(freq[sum + offset] != -2){
                maxLength = Math.max(maxLength, i - freq[sum + offset]);
            } else {
                freq[sum + offset] = i;
            }
        }
        
        return maxLength;
    }
}