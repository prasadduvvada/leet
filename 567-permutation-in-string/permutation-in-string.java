class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int s1_arr [] = new int[26];
        int s2_arr [] = new int[26];
        if (n1 > n2) return false;
        for(char x: s1.toCharArray()) {
           s1_arr[x-'a']++;
        }
        for(int i=0; i<n2 ; i++){
            s2_arr[s2.charAt(i)-'a']++;
            if(i>=n1){
                s2_arr[s2.charAt(i-n1)-'a']--;
            }
            if(Arrays.equals(s1_arr,s2_arr)){
                return true;
            }
        }
    return false;
    }
}