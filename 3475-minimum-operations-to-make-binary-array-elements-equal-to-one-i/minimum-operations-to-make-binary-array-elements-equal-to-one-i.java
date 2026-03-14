class Solution {
    public int minOperations(int[] nums) {
         int sum =0;
          int count =0;
          for(int i=0; i<nums.length -2; i++){
               int j = i;
               if(nums[i] == 0){
                    while(j<=i+2){
                        nums[j] = nums[j] ^ 1;
                        j++;
                    }
                   count++;
               }
          }
          for(int value:nums){
            sum+=value;
          }
        return (sum == nums.length) ? count : -1; 
    }
}