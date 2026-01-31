class Solution {
    public String reversePrefix(String s, int k) {
             char []arr =  s.toCharArray();
           int i=0,j=k-1;
           while(i<j){
                char tem =  arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
                i++;
                j--;
           }
        String rev = new String(arr);
              return rev;
        }
    }