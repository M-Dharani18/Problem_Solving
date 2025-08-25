class Solution {
    public boolean checkIfPangram(String sentence) {
    // int[] freq = new int[26];
    // for(int i:sentence.toCharArray()){
    //     freq[i-'a']++;
    // }  
    // for(int j : freq){
    //     if(j==0)
    //         return false;
    // }
    // return true;
    
    if(sentence.length()<26)
        return false;
    
    for(char c ='a'; c<='z'; c++){
        if(sentence.indexOf(c)==-1)
            return false;
    }
    return true;
    }
}