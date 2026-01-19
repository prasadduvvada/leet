import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean hasAllCodes(String s, int k) {
        int totalRequired = 1 << k;
        Set<Integer> seen = new HashSet<>();
        int mask = (1 << k) - 1;
        int currentHash = 0;

        for (int i = 0; i < s.length(); i++) {
            currentHash = ((currentHash << 1) & mask) | (s.charAt(i) - '0');
            
            if (i >= k - 1) {
                seen.add(currentHash);
            }
            
            if (seen.size() == totalRequired) {
                return true;
            }
        }

        return false;
    }
}