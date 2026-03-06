class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int map[] = new int[256];
    Set<Integer> seen = new HashSet<>();
    Set<String> repeated = new HashSet<>();
       map['A'] = 0; map['C'] = 1; map['G'] = 2; map['T'] = 3;
       int current = 0;
       for(int i=0; i<s.length(); i++){
         current = (current << 2) | map[s.charAt(i)];

         if( i>= 9){
            current &= (1 << 20) -1;
             
            if(!seen.add(current)){
                repeated.add(s.substring(i-9,i+1));
            }
         }
       }
       return new ArrayList<>(repeated);
    }
}