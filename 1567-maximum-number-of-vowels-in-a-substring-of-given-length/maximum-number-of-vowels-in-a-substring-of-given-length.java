class Solution {
    public int maxVowels(String s, int k) {
        int count  =0,max =0;
    for(int i=0;i<s.length();i++){
       if(ovels(s.charAt(i))){
        count++;
       }
       if(i >= k){
        if(ovels(s.charAt(i-k))){
            count--;
        }
     }
    max = Math.max(count,max);
    if (max ==k) return max;
}
   return max;
}
    private Boolean ovels(char st){
      return "aeiou".indexOf(st) != -1;
    }
}