class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;  // Initialize X to 0

        for (String op : operations) {
            switch (op) {
                case "++X":
                case "X++":
                    X++;  // Increase X by 1
                    break;
                case "--X":
                case "X--":
                    X--;  // Decrease X by 1
                    break;
            }
        }
        return X;  // Return final value of X
    }
}
