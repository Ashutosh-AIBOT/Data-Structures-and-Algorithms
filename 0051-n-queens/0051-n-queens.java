class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] chess = new char[n][n];

        // Fill board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(chess[i], '.');
        }

        setQueens(chess, 0, result);
        return result;
    }

    public boolean isSafe(char[][] chess, int row, int col) {
        // Check vertical
        for (int i = 0; i < row; i++) {
            if (chess[i][col] == 'Q') return false;
        }

        // Check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 'Q') return false;
        }

        // Check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 'Q') return false;
        }

        return true;
    }

    public void setQueens(char[][] chess, int row, List<List<String>> result) {
        if (row == chess.length) {
            List<String> board = new ArrayList<>();
            for (char[] r : chess) {
                board.add(new String(r));
            }
            result.add(board);
            return;
        }

        for (int j = 0; j < chess.length; j++) {
            if (isSafe(chess, row, j)) {
                chess[row][j] = 'Q';
                setQueens(chess, row + 1, result);
                chess[row][j] = '.';
            }
        }
    }
}
