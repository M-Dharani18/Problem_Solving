class Solution {
    public int mostWordsFound(String[] sentences) {
        int cl,mx=0;
        for(String i:sentences){
            cl=i.split(" ").length;
            if(cl>mx){
                mx=cl;
            }
        }
        return mx;
    }
}