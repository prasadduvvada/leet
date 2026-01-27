class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> repeating = new HashSet<>();
        int i=0,j=0,max=0;
        if(s.length() == 0) return 0;
        while(j<s.length()){
               if(!repeating.contains(s.charAt(j))){
                repeating.add(s.charAt(j));
                j++;
                max = Math.max(max,repeating.size());
               }
               else{
                repeating.remove(s.charAt(i));
                i++;
               }
        }
        return max;
    }
}