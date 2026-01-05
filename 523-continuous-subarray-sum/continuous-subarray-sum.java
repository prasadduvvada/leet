class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum =0;
        boolean result = false;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        if(nums.length < 2){
            return false;
        }
        for(int i =0; i<nums.length; i++){
           sum += nums[i];
           int remainder = sum % k;
           if(remainder < 0){
            remainder += k;
           }
        if(map.containsKey(remainder)){
         if(i - map.get(remainder) >= 2){
            return true;
        }
    }
      else{
        map.put(remainder,i);
        }
        
    }
    return false;
}
}