import java.util.HashSet;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Create arrays of sets to track seen digits in rows, cols, and boxes
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];

                if (current == '.') continue;

                if (rows[i].contains(current)) return false;
                rows[i].add(current);

                if (cols[j].contains(current)) return false;
                cols[j].add(current);

                // Check 3x3 box
                int boxIndex = (i / 3) * 3 + (j / 3);
                if (boxes[boxIndex].contains(current)) return false;
                boxes[boxIndex].add(current);
            }
        }

        // If all checks passed
        return true;
    }
}
