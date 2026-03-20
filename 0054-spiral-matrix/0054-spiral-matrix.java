class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length-1;
        int n=matrix[0].length-1;
        int top=0,bottom=m,left=0,right=n;
        List<Integer> li = new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                li.add(matrix[top][i]);
            }
            top++;
            for(int j=top;j<=bottom;j++){
                li.add(matrix[j][right]);
            }
            right--;
            if(top<=bottom){
                for(int k=right;k>=left;k--){
                li.add(matrix[bottom][k]);
                }
            }
            bottom--;
            if(left<=right){
                for(int l=bottom;l>=top;l--){
                li.add(matrix[l][left]);
                }
            }
            left++;
        }
        return li;
    }
}