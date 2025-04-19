class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return result;
        }

        String[] phoneMap = {
            "",     "",     "abc",  "def",  "ghi", 
            "jkl",  "mno",  "pqrs", "tuv",  "wxyz"
        };

        backtrack(result, phoneMap, digits, 0, new StringBuilder());
        return result;
    }

    private void backtrack(List<String> result, String[] phoneMap, String digits, int index, StringBuilder path) {
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }

        String letters = phoneMap[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            path.append(letter);
            backtrack(result, phoneMap, digits, index + 1, path);
            path.deleteCharAt(path.length() - 1);
        }
    }
}
