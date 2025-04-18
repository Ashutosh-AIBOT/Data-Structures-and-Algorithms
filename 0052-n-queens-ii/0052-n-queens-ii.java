class Solution {
    int count = 0;

    public int totalNQueens(int n) {
        char[][] board = new char[n][n];

        
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        solve(0, board, n);
        return count;
    }

    public void solve(int row, char[][] board, int n) {
        if (row == n) {
            count++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q';     // place queen
                solve(row + 1, board, n);  // move to next row
                board[row][col] = '.';     // backtrack
            }
        }
    }

    public boolean isSafe(int row, int col, char[][] board, int n) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }
}
