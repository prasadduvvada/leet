class Solution {
    public String countAndSay(int n) {
        String sb = "";
         for(int i=0; i<n; i++){
         sb=count(n,sb);
    }
    return sb;
}
    public static String count(int n,String s){
        StringBuilder result = new StringBuilder();
          if(s.length() == 0 ) return "1";
          else{
            for(int i=0; i<s.length(); i++){
                int temp = s.charAt(i) - '0';
                int say =1;
                while( i+1 < s.length() &&s.charAt(i+1) -'0' == temp){ 
                    say++;
                    i++;
                }
                result.append(say).append(temp);
            }

        }
        return result.toString();
    }
}