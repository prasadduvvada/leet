class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        // Initialize result array to store answers for each query
        int result[] = new int[queries.length];
        
        // This array acts as a 'map' where 1 = word is a vowel string, 0 = it is not
        int vowel_check[] = new int[words.length];
        String ovels = "aeiouAEIOU"; 
        
        int k = 0;
        // --- PHASE 1: PRE-PROCESSING ---
        // Identify which individual words start and end with a vowel
        for(String s : words){
            if(s.length() > 0){
                char first = s.charAt(0);
                char last = s.charAt(s.length() - 1);
                
                // If both first and last characters are found in the 'ovels' string
                if(ovels.indexOf(first) != -1 && ovels.indexOf(last) != -1){
                    vowel_check[k]++; // Mark this index as a valid vowel string
                }
            }
            k++; // Move to the next index in vowel_check
        }

        // --- PHASE 2: QUERY PROCESSING ---
        // For each query, loop through the specified range and count the 1s
        for(int i = 0; i < queries.length; i++){
            int start = queries[i][0]; // Left boundary of the query
            int end = queries[i][1];   // Right boundary of the query
            int count = 0;
            
            // Iterate from the start index to the end index of the current query
            for(int j = start; j <= end; j++){
                count += vowel_check[j]; // Add 1 if it's a vowel string, 0 otherwise
            }
            
            // Store the total count for this specific query
            result[i] = count;
        }
        
        return result;
    }
}