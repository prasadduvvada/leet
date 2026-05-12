class Solution {
    public boolean isStrictlyPalindromic(int n) {
        boolean result = true;
        if(n<=4){
            for(int i =2; i<=n-2; i++){
            String binary = "";
            int base =i;
        while(n > 0){
              binary = (n%i) + binary;
              n = n /2;
        }
        String reversed = new StringBuilder(binary).reverse().toString();
        if(!binary.equals(reversed)){
            return false;
        }
      }
    }
    else{
        return false;
    }
    return true;
}
}