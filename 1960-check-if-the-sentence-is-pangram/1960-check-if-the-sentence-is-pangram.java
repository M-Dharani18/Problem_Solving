class Solution {
    public boolean checkIfPangram(String sentence) {
    int[] freq = new int[26];
    for(int i:sentence.toCharArray()){
        freq[i-'a']++;
    }  
    for(int j : freq){
        if(j==0)
            return false;
    }
    return true;}
}