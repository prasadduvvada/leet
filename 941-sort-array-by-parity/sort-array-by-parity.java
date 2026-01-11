class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i =0;
        int j = 0;
        while ( j <= nums.length-1){
         if(nums[j] % 2 ==0 ){
           int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j++;
        }else{
            j++;
        }
    }
     return nums;
   }
}