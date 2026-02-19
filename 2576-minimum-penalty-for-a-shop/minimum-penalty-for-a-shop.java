class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int maxScore = 0;
        int currentScore = 0;
        int bestHour = 0;

        for (int i = 0; i < n; i++) {
            if (customers.charAt(i) == 'Y') {
                // 'Y' means being open was good, so "score" improves
                currentScore++;
            } else {
                // 'N' means being open was bad, so "score" drops
                currentScore--;
            }

            // If we found a better score, this is the new best hour to close
            if (currentScore > maxScore) {
                maxScore = currentScore;
                bestHour = i + 1;
            }
        }

        return bestHour;
    }
}