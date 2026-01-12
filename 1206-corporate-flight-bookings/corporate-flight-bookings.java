class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int []tickets = new int[n+2];
        for(int i=0; i<bookings.length;i++){
            int pos = bookings[i][0];
            int next = bookings[i][1];
            int value  = bookings[i][2];
            tickets[pos] += value;
            tickets[next+1] -=value;
        }
        int results[] = new int[n];
         int current =0;
    for(int x =1; x<=n; x++){
        current +=tickets[x];
        results[x-1] =current;
    }
return results;
    }
}