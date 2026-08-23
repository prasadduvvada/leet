class Solution {
    public int lengthOfLongestSubstring(String s) {
     boolean seen[] = new boolean[128];
     int left =0;
     int max =0;
      
      for(int i=0; i<s.length(); i++){
        char current = s.charAt(i);

        while(seen[current]){
             char leftchar = s.charAt(left);
             seen[leftchar] = false;
             left++;
        }
        seen[current] = true;

        max = Math.max(max , i - left + 1);
      }

        
        return max;
    }
}