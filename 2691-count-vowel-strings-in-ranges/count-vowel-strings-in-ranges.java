class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int result[] = new int[queries.length];
        int vowel_check[] = new int[words.length];
        String ovels = "aeiouAEIOU"; 
        int k =0;
        for(String s:words){
                if(s.length() > 0){
                    char first = s.charAt(0);
                    char last = s.charAt(s.length() -1);
                    if(ovels.indexOf(first) != -1 && ovels.indexOf(last) != -1){
                        vowel_check[k]++;
                    }
                }
                k++;
        }
       for(int i =0; i<queries.length; i++){
                int start = queries[i][0];
                int end = queries[i][1];
                int count =0;
                for(int j = start; j<=end; j++){
                    count+=vowel_check[j];
                }
                result[i] = count;
        }
        return result;
       }
     }