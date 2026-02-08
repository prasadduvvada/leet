class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    //    Arrays.sort(nums);
        Set<List<Integer>> triplets = new HashSet<>();
         for(int i =0;i<nums.length;i++){
            if(i> 0 && nums[i] == nums[i-1]) continue;
            HashSet<Integer> set = new HashSet<>();
            for(int j =i+1; j<nums.length; j++){
                int k = -(nums[i]+nums[j]);
                if(set.contains(k)){
                   List<Integer> dummy = Arrays.asList(nums[i],nums[j],k);
                    Collections.sort(dummy);
                   triplets.add(dummy);
                }
                    set.add(nums[j]);
            }
        }
            return new ArrayList<>(triplets);
    }
}