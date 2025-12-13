class Solution {
    public int strStr(String haystack, String needle) {
     haystack = haystack.toLowerCase();
     needle = needle.toLowerCase();
     int index = 0;
     if(haystack.contains(needle)){
         index = haystack.indexOf(needle);
        return index;
     }   
     else{
        return -1;
     }
    }
}