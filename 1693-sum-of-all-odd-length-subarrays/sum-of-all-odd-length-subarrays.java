class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int totalSum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int currentsum = 0;
            for (int j = i; j < n; j++) {
                currentsum += arr[j]; 
                if ((j - i + 1) % 2 != 0) {
                    totalSum += currentsum;
                }
            }
        }
        return totalSum;
    }
}