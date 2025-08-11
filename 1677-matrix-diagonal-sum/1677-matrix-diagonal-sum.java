class Solution {
    public int diagonalSum(int[][] mat) {
        int sum1=0;
        for(int i=0;i<mat.length;i++){
            sum1+=mat[i][i];
            if(i!=mat.length-1-i){
                sum1+=mat[i][mat.length-1-i];
            }
        }
        return sum1;
    }
}