class Solution {
    public int largestAltitude(int[] gain) {
        int biker = 0;
        int altitude =0;
        for(int i=0; i<gain.length; i++){
                   biker += gain[i];
                altitude = Math.max(altitude,biker);
        }
return altitude;
    }
}