class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder ans1 = new StringBuilder();
        StringBuilder ans2 = new StringBuilder();
        for(int i=0;i<word1.length;i++){
            ans1.append(word1[i]);
        }
        for(int j=0;j<word2.length;j++){
            ans2.append(word2[j]);
        }
        String a1=ans1.toString();
        String a2=ans2.toString();
        if(a1.equals(a2)) return true;
        else return false;
    }
}
// class Solution {
//     public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//         StringBuilder str1 = new StringBuilder();
//         StringBuilder str2 = new StringBuilder();

//         for(String word : word1){
//             str1.append(word);
//         }
//         for(String word : word2){
//             str2.append(word);
//         }
//         String s1 = str1.toString();
//         String s2 = str2.toString();

//         if(s1.equals(s2)){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
// }