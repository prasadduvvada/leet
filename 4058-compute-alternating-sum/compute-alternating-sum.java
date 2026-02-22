class Solution {
    public int alternatingSum(int[] nums) {
        int alter_sum =0;
        for(int i=0; i<nums.length; i++){
            if(i %2 ==0){
               alter_sum+= nums[i];
            }
            else{
                alter_sum-= nums[i];
            }
        }
        return alter_sum;
    }
}