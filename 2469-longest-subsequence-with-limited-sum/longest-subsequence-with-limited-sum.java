class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
             nums[i] = nums[i-1] + nums[i];
        }
         int result[] = new int[queries.length];
        for(int j=0; j<queries.length; j++){

            int count =0;
            while(count < nums.length && nums[count] <= queries[j]){
                count++;
            } 
            result[j] = count;
        }
        return result;
    }
}