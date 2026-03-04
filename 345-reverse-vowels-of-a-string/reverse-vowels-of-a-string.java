class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length() -1;
        String vowels = "aeiouAEIOU";
        char []arr = s.toCharArray();
        while(i < j){
             if(vowels.indexOf(arr[i]) != -1 )
               {
                 if(vowels.indexOf(arr[j]) != -1){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                 }
                 else{
                 j--;
                 }
               }
               else{
                i++;
               }
        }
        return new String(arr);
    }
}