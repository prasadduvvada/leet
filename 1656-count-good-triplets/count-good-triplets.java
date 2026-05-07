class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int len = arr.length;
        int count = 0;
        for(int i=0; i<len-2; i++){
           for(int j=i+1; j<len-1; j++){
            for(int k=j+1; k<len; k++){ 
            int first = Math.abs(arr[i] - arr[j]);
            int mid = Math.abs(arr[j] - arr[k]);
            int last = Math.abs(arr[i] - arr[k]);
            if(first <= a && mid <= b && last <= c){
                count++;
                } 
            }
         }
     }
        return count;
    }
}