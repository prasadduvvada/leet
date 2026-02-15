class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int dupli[] = new int[2];
        int i=0;
        for(int x: nums){
                if(set.contains(x)){
                     dupli[i] = x;
                     i++;
                }
                else{
                    set.add(x);
                }
        }
        return dupli;
    }
}