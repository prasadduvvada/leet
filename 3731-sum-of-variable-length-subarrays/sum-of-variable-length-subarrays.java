class Solution {
    public int subarraySum(int[] nums) {
        int n = nums.length;
        int totalSum = 0;

        // Step 1: Build Prefix Sum Array
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        // Step 2: Calculate variable length subarray sums
        for (int i = 0; i < n; i++) {
            // Define the start based on the problem rule
            int start = Math.max(0, i - nums[i]);
            
            // Get sum of subarray nums[start...i] using prefix array
            int currentSubarraySum = prefix[i + 1] - prefix[start];
            
            totalSum += currentSubarraySum;
        }

        return totalSum;
    }
}