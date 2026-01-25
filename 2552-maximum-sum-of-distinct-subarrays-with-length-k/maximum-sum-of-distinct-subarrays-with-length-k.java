class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        long max = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (i >= k) {
                int leftVal = nums[i - k];
                sum -= leftVal;   
                int count = map.get(leftVal);
                if (count == 1) {
                    map.remove(leftVal);
                } else {
                    map.put(leftVal, count - 1);
                }
            }
            if (i >= k - 1) {
                if (map.size() == k) {
                    max = Math.max(sum, max);
                }
            }
        }
        return max;
    }
}