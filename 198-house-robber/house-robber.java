class Solution {
    public int rob(int[] nums) {
    int perv = nums[0];
    int pervs2 = 0;
    int robbery =0;
    int skip =0;
    for(int i =1; i<nums.length; i++){
        robbery = nums[i];
        if(i>1) {robbery += pervs2;}
        skip = 0 + perv;
       int curi = Math.max(robbery,skip);
        pervs2 = perv;
        perv = curi;
    }
    return perv;
}
}