class Solution {
    public int numRookCaptures(char[][] board) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    return checkDir(board, i, j, -1, 0) + 
                           checkDir(board, i, j, 1, 0)  + 
                           checkDir(board, i, j, 0, -1) + 
                           checkDir(board, i, j, 0, 1);  
                }
            }
        }
        return 0;
    }
    private int checkDir(char[][] board, int r, int c, int dr, int dc) {
        r += dr;
        c += dc;
        while (r >= 0 && r < 8 && c >= 0 && c < 8) {
            if (board[r][c] == 'p') return 1; 
            if (board[r][c] == 'B') return 0; 
            r += dr; 
            c += dc;
        }
        return 0; 
    }
}
