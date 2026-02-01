class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int beauty[] = new int[nums.length - k +1];
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0; i<k; i++){
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        beauty[0] = sort(map,x);
        for(int i=k; i<nums.length; i++){
            int out = nums[i-k];
            if(map.get(out) == 1){
                map.remove(out);
            }
            else{
                map.put(out,map.get(out)-1);
            }
            int in = nums[i];
            map.put(in, map.getOrDefault(in, 0) + 1);
           beauty[i-k+1] = sort(map,x);
        }
        return beauty;
    }
    public static int sort(TreeMap<Integer,Integer> map, int x){
       int count =0;
       for(int largest : map.keySet()){
        if(largest > 0){
            break;
        }
        count+=map.get(largest);
        if(count >= x){
            return largest;
        }
       }
       return 0;
    }
}