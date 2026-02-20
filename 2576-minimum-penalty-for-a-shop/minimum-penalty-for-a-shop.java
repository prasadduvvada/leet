class Solution {
    public int bestClosingTime(String customers) {
      int n = customers.length();
      int prefixn[] = new int[n+1];
      int suffixy[] = new int[n+1];
      for(int i=0; i<n; i++){
        prefixn[i+1] = prefixn[i]+(customers.charAt(i) == 'N' ? 1:0);
      }
      for(int i = n-1; i>=0; i--){
         suffixy[i] = suffixy[i+1]+(customers.charAt(i) == 'Y' ? 1:0);
      }
      int min = Integer.MAX_VALUE;
      int best =0;
      for(int i=0; i<=n; i++){
        int cur = prefixn[i] + suffixy[i];
        if(cur < min){
            min = cur;
            best =i;
        }
      }
      return best;
    }
}