class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        char []arr = s.toCharArray();
        int left=0;
        int maxlength =0;
        int max_frequency =0;
       
        for(int right=0; right<arr.length; right++){
             freq[arr[right] - 'A']++;
             max_frequency = Math.max(max_frequency,freq[arr[right] -'A']);
             int window = right - left +1;
             if(window - max_frequency > k){
                freq[arr[left] - 'A']--;
                left++;
             }
             
             maxlength = Math.max(maxlength,right - left +1 );
               
        }
        return maxlength;
    }
}