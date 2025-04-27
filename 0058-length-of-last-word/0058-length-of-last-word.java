class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(" ");
        if (lastSpaceIndex == -1) {
            return s.length();
        }
        return s.length() - lastSpaceIndex - 1;
    }
}
