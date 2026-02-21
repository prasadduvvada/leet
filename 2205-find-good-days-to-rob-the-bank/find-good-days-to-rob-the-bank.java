class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        ArrayList<Integer> li = new ArrayList<>();
        int n = security.length;
        int left[] = new int [n];
        int right[] = new int [n];

        if (time == 0) {
            for (int i = 0; i < n; i++)  li.add(i);
            return li;
        }
        for(int i=1; i<n; i++){
            if(security[i] <= security[i-1]){
                left[i] = left[i-1]+1;;
            }
        }
        for(int i = n-2; i>=0; i--){
            if(security[i] <= security[i+1]){
                right[i] = right[i+1]+1;
            }
        }
        for(int j = time; j<n-time; j++){
            if(left[j] >=time && right[j] >=time){
                li.add(j);
            }
        }
        return li;
    }
}