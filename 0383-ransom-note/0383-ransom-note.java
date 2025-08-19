class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         int[] freq1= new int[26];
         for(char i : magazine.toCharArray()){
            ++freq1[i-'a'];
         }
         for(char j : ransomNote.toCharArray())
            if( --freq1[j-'a'] < 0)
                return false;
         return true;
        }
}