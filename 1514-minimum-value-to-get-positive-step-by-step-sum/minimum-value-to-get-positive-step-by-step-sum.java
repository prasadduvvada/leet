class Solution {
    public int minStartValue(int[] nums) {
        int sum = 0;
        int total =0;
        for(int i =0 ; i < nums.length; i++){
            sum  += nums[i];
            total = Math.min(total,sum);
        }
        return (total < 0) ? Math.abs(total)+1 : 1;
    }
}