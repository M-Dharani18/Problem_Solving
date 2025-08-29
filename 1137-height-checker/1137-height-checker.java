class Solution {
    public int heightChecker(int[] heights) {
        int c=0;
        int[] ori=Arrays.copyOf(heights,heights.length);
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++){
            if(ori[i]!=heights[i]){
                c++;
            }
        }
        return c;
    }
}