class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        int index=0,count=0;
        int res[] = new int[nums.length];
        for(int x: nums){
            if(x < pivot){
                less.add(x);
            }
            else if(x > pivot){
                greater.add(x);
            }
            else{
                count++;
            }
        }
        for (int x : less) {
         res[index++] = x;
        }
        for (int k = 0; k < count; k++) {
            res[index++] = pivot;
            }
        for (int x : greater) {
            res[index++] = x;
        }
return res;
    
        }
    }