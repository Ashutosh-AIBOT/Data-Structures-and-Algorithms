import java.util.*;

class Solution {
    public List<Integer> lexicalOrder(int n) {
        String[] arr = new String[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(i + 1);
        }

        // Sort lexicographically
        Arrays.sort(arr);

        // Convert back to integers
        List<Integer> result = new ArrayList<>();
        for (String s : arr) {
            result.add(Integer.parseInt(s));
        }

        return result;
    }
}
