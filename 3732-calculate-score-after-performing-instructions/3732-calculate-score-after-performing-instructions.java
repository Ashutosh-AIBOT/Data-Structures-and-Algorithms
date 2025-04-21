import java.util.HashSet;

class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        int len = values.length;
        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        long score = 0;

        while (i >= 0 && i < len) {
            if (set.contains(i)) {
                break;
            }
            set.add(i);  // Mark current index as visited BEFORE jumping or adding

            switch (instructions[i]) {
                case "add":
                    score += values[i];
                    i++;
                    break;

                case "jump":
                    i += values[i];
                    break;
            }
        }

        return score;
    }
}
