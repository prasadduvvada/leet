class Solution {
    public int maxScore(int[] cardPoints, int k) {
     int right_sum=0,left_sum=0;
     for(int i=0; i<k; i++){
         left_sum += cardPoints[i];
     }
     int max = left_sum;
     int right = cardPoints.length -1;
     for(int j =k-1; j>=0; j--){
         left_sum -= cardPoints[j];
         right_sum += cardPoints[right];
         right--;
         max =Math.max(max,left_sum+right_sum);
     }
     return max;   
    }
}