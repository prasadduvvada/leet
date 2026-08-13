class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        Arrays.sort(people);
        int left =0,right = n-1;
        int req_boats =0;
        while(left <= right){
            if(people[left] + people[right] <= limit){
              left++;
            }
            right--;
            req_boats++;
        }
    return req_boats;
    }
}