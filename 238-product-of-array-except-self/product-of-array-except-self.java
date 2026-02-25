class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res[] = new int[n]; // This will store our final answer

        // STEP 1: FILL WITH PREFIX PRODUCTS
        // res[i] will store the product of everything to the LEFT of index i
        res[0] = 1; // Nothing is to the left of the first element
        for(int i = 1; i < n; i++){
           // Current prefix = (Previous prefix) * (The number we just passed)
           res[i] = res[i - 1] * nums[i - 1];
        }

        // STEP 2: MULTIPLY BY SUFFIX PRODUCTS
        // We travel backwards, keeping track of the product of everything to the RIGHT
        int suffix = 1; // Nothing is to the right of the last element
        for(int i = n - 1; i >= 0; i--){
            // Final Answer = (Everything on Left) * (Everything on Right)
            res[i] = res[i] * suffix;
            
            // Update suffix for the next element to the left
            suffix *= nums[i];
        }

        return res;
    }
}