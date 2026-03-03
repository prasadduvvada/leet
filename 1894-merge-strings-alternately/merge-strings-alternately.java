class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length() + word2.length();
        int i=0;
        int j=0;
        StringBuilder sb = new StringBuilder();
        while(sb.length() < n){
           if(i<word1.length()){
            sb.append(word1.charAt(i));
            i++;
           }
           if(j<word2.length()){
           sb.append(word2.charAt(j));
           j++;
           }
        }
        return sb.toString();
    }
}