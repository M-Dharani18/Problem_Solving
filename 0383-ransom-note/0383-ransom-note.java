class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         int[] freq1= new int[26];
         char [] m = ransomNote.toCharArray();
         int n=m.length;
         for(char i : ransomNote.toCharArray()){
            freq1[i-'a']++;
         }
         for(char j : magazine.toCharArray()){
            freq1[j-'a']--;
         }
         for(int i=0;i<26;i++){
            if(freq1[i]>0)
            return false;
         }
         return true;
        }
}