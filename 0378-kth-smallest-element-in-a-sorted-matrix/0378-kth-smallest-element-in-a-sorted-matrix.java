class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> li = new ArrayList<>();
        int n=matrix.length;
        // int i=0;
        // while(i<k*2&&i<n*n){
            for(int m=0;m<n;m++){
                for(int j=0;j<n;j++){
                    li.add(matrix[m][j]);
                }
            }
        Collections.sort(li);
        return li.get(k-1);
    }
}