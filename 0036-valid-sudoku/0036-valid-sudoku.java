class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m=0,n=0;
        List<Character> l = new ArrayList<>();
        Set<Character> s = new HashSet<>();
        //row
        for(int i=0;i<9;i++){
            l.clear();
            s.clear();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.') l.add(board[i][j]);
        }
        for(char c:l) s.add(c);
        if(l.size()!=s.size()) return false;
        }
        //col
        for(int j=0;j<9;j++){
             l.clear();
            s.clear();
            for(int i=0;i<9;i++){
                if(board[i][j]!='.')
                l.add(board[i][j]);
            }
        for(char c:l) s.add(c);
        if(l.size()!=s.size()) return false;
        }
        //3x3 box
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                Set<Character> set = new HashSet<>();
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        char c = board[i][j];
                        if (c != '.') {
                            if (!set.add(c)) return false;
                        }
                    }
                }
            }
        }
    return true;}
}