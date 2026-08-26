class Solution {
    public int longestSubstring(String s, int k) {
        int max =0;
     
        for(int target_unique =1; target_unique <=26; target_unique++){
 
            int left =0,unique=0,countAtleastk=0;
            int freq[] = new int[26];
            for(int i =0; i<s.length(); i++){

                int val = s.charAt(i) - 'a';

                if(freq[val] == 0){
                    unique++;
                }
                freq[val]++;

                if(freq[val] == k){
                    countAtleastk++;
                }

                while(unique > target_unique){
                    int leftval = s.charAt(left) - 'a';

                    if(freq[leftval] == k){
                        countAtleastk--;
                    }

                    freq[leftval]--;
                    if(freq[leftval] == 0){
                        unique--;
                    }
        
                    left++;
                }
                if(unique == target_unique && countAtleastk == target_unique){
                    max = Math.max(max, i-left+1);
                }
            }
        }
        return max;
    }
}