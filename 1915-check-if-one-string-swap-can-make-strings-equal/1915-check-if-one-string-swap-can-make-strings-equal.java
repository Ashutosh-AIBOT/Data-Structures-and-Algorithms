class Solution {
 public boolean areAlmostEqual(String s1, String s2) {
        // Step 1: If strings are already equal, return true
        if (s1.equals(s2)) {
            return true;
        }

        // Step 2: Track the indices where the strings differ
        List<Integer> diffIndices = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffIndices.add(i);  // Store the index of difference
            }
        }

        // Step 3: If there are exactly two differences, check if a swap can solve
        if (diffIndices.size() == 2) {
            int i = diffIndices.get(0);
            int j = diffIndices.get(1);
            // Check if swapping s1[i] with s1[j] would make the strings equal
            return s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i);
        }

        // Step 4: If there are not exactly two differences, return false
        return false;
    }
}
