class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String ans1="",ans2="";
        for(int i=0;i<word1.length;i++){
            ans1 = ans1+word1[i];
        }
        for(int j=0;j<word2.length;j++){
            ans2= ans2+word2[j];
        }
        if(ans1.equals(ans2)) return true;
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