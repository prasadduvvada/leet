import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
      List <Integer> li = new ArrayList<>();
       int pcount [] = new int[26];
       int scount [] = new int[26];
       for(int x:p.toCharArray()){
         pcount[x-'a']++;
       }
       for(int i=0; i<s.length();i++){
        scount[s.charAt(i) -'a']++;
        if(i >= p.length()){
            scount[s.charAt(i-p.length()) - 'a']--;
        }
        if(Arrays.equals(pcount,scount)){
            li.add(i-p.length()+1);
        }
       }
       return li;
    }
}