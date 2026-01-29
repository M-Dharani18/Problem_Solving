class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int []> q = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        int fresh=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1) fresh++;
                else if(grid[i][j]==2)  q.offer(new int[]{i, j});
            }
        }
        int timer=0;
        while(!q.isEmpty() && fresh > 0){
            int size=q.size();
            timer++;
            while(size-- >0){
                int[] p = q.poll();
                int r = p[0];
                int c = p[1];
                //right
                if(c+1<n && grid[r][c+1]==1){
                    grid[r][c+1]=2;
                    fresh--;
                    q.offer(new int[]{r, c+1});
                }
                //down
                if(r+1<m && grid[r+1][c]==1){
                    grid[r+1][c]=2;
                    fresh--;
                    q.offer(new int[]{r+1, c});

                }
                //left
                if(c-1>=0 && grid[r][c-1]==1){
                    grid[r][c-1]=2;
                    fresh--;
                    q.offer(new int[]{r, c-1});
                }
                //up
                if(r-1 >=0 &&grid[r-1][c]==1){
                    grid[r-1][c]=2;
                    fresh--;
                    q.offer(new int[]{r-1, c});
                }
            }
        }
        return fresh == 0 ? timer : -1;
    }
}