class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder ans1 = new StringBuilder();
        StringBuilder ans2 = new StringBuilder();
        for(String s : word1){
            ans1.append(s);
        }
        for(String d: word2){
            ans2.append(d);
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