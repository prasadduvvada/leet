class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet <Character> hs = new HashSet<>();
        for(int i = 0 ; i<sentence.length() ; i++){
            hs.add(sentence.charAt(i));
        }
         boolean check = hs.size() == 26;
    return check;
    }

}