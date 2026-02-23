class Solution {
    public int[] shuffle(int[] nums, int n) {
     int shuff[] = new int[2*n];
     int i=0,j=n,k=1,l=0;
     while(j<nums.length){
       shuff[l] = nums[i];
       shuff[k] = nums[j];
       l+=2;
       k+=2;
       i++;
       j++;
     }
     return shuff;
    }
}