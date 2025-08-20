class Solution {
    public char findTheDifference(String s, String t) {
        // int[] freq=new int[26];
        // char[] c1 = s.toCharArray();
        // char[] c2 = t.toCharArray();
        // for(char c : c1){
        //     freq[c-'a']++;
        // }
        // for(char c : c2){
        //     freq[c-'a']--;
        // }
        // for(int i=0;i<26;i++){
        //     if(freq[i]==-1)
        //     return (char)('a'+i);
        // }
        // return 0;
        char c=0;
        for(char c1 : s.toCharArray()) c^=c1;
        for(char c2 : t.toCharArray()) c^=c2;
        return c;
    }
}