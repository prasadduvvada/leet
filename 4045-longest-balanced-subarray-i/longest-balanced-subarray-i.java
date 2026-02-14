class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int tot =0;
        for(int i =0; i<n; i++){
            HashSet<Integer> unq_even = new HashSet<>();
            HashSet<Integer> unq_odd = new HashSet<>();
            for(int j=i; j<n; j++){
                if(nums[j] % 2 ==0){
                    unq_even.add(nums[j]);
                }
                else{
                    unq_odd.add(nums[j]);
                }
             if(unq_even.size() == unq_odd.size()){
                tot = Math.max(tot,j-i+1);
             }
        }
           
     }
        return tot;
    }
}