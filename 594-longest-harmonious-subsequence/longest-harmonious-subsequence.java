class Solution {
   public int findLHS(int[] nums) {
    HashMap<Integer, Integer> count = new HashMap<>();
    for (int n : nums) {
        count.put(n, count.getOrDefault(n, 0) + 1);
    }
    
    int result = 0;
    for (int key : count.keySet()) {
        if (count.containsKey(key + 1)) {
            result = Math.max(result, count.get(key) + count.get(key + 1));
        }
    }
    return result;
}
}