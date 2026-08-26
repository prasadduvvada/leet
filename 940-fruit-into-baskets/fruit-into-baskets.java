class Solution {
    public int totalFruit(int[] fruits) {
        int left =0,max =0,unique=0;
        int freq[] = new int[fruits.length];
        
        for(int i=0; i<fruits.length; i++){
            int val = fruits[i];
            if(freq[val] == 0){
                unique++;
            }
            freq[val]++;

            while(unique > 2){
                int left_val = fruits[left];
                freq[left_val]--;
                if(freq[left_val] == 0){
                    unique--;
                }
                left++;
            }

            max = Math.max(max,i-left+1);
        }
        return max;
    }
}