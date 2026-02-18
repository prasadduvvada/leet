class Solution {
    public boolean search(int[] nums, int target) { 
        return recursive_search(0, nums.length - 1, target, nums);
    }

    public boolean recursive_search(int low, int high, int target, int[] nums) {
        // Base Case: Range is exhausted
        if (low > high) return false;

        int mid = low + (high - low) / 2;
        if (nums[mid] == target) return true;

        // Handle the duplicate case: shrink the search space and try again
        if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
            return recursive_search(low + 1, high - 1, target, nums);
        }

        // Left side is sorted
        if (nums[low] <= nums[mid]) {
            if (nums[low] <= target && target < nums[mid]) {
                return recursive_search(low, mid - 1, target, nums);
            } else {
                return recursive_search(mid + 1, high, target, nums);
            }
        } 
        // Right side is sorted
        else {
            if (nums[mid] < target && target <= nums[high]) {
                return recursive_search(mid + 1, high, target, nums);
            } else {
                return recursive_search(low, mid - 1, target, nums);
            }
        }
    }
}