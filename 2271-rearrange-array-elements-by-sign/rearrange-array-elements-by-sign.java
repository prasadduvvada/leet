class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i=0,j=1;
        int res [] = new int[nums.length];
        for(int x =0; x< nums.length; x++){
            if(nums[x] > 0){
               res[i] = nums[x];
               i+=2;
            }
            else{
                res[j] = nums[x];
                j+=2; 
            }
        }
    return res;
     }
}