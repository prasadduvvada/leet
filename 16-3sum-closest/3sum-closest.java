class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closet = nums[0]+nums[1]+nums[2];
        int n = nums.length;
        for(int i=0; i<n-2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int cur = nums[i];
            int left = i+1;
            int right = n-1;
            while(left < right){
                int sum = cur + nums[left]+ nums[right];
                 if(Math.abs(target - sum) < Math.abs(target - closet)){
                    closet = sum;
                 }
                 if(sum < target){
                    left++;
                 }
                 else if(sum > target){
                    right--;
                 } 
                 else{ 
                    return sum;
                 }
            }
        }
        return closet;
    }
}