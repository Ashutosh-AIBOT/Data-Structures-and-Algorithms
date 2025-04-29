import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, maxLen = 0;
        HashSet<Character> set = new HashSet<>();

        while (j < s.length()) {
            char c = s.charAt(j);
            if (!set.contains(c)) {
                set.add(c);
                j++;
                maxLen = Math.max(maxLen, set.size()); 
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return maxLen;
    }
}
