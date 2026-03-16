class Solution {
    public int maxScore(String s) {
         int n = s.length();
         char arr[] = s.toCharArray();
         int ones =0;
          for(char val:arr){
            if(val == '1'){
               ones++;
            }
          }
          int zeros =0;
          int max =0;
          for(int i=0; i<n-1; i++){
            
                if(arr[i] == '0'){
                   zeros++;
                }
                else{
                    ones--;
                }
              max = Math.max(max, zeros + ones);

          }
    return max;
    }
}