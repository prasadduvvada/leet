class Solution {
    public boolean isPowerOfFour(int n) {
        return power(n);
    }
    public boolean power(int n){
        if( n==1 ){
            return true;
        }
        else if (n <=0 || n%4 != 0) return false;
        return power(n/4);
    }
}