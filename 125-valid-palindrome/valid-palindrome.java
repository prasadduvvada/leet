class Solution {
    public boolean isPalindrome(String s) {
         String modified = s.toLowerCase().replaceAll("[^a-z0-9]" ,"");
         int left =0;
         int right = modified.length() -1 ;
         while(left < right){
            if(modified.charAt(left) != modified.charAt(right)){
                return false;
            }
            else{
                left++;
                right--;
            }
         }
         return true;
  }
}