class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;    // Stores the maximum number of consecutive 1s
        int count = 0;  // Current count of consecutive 1s
        
        for (int num : nums) {
            if (num == 1) {
                count++;         // Increment count if we see a 1
                max = Math.max(max, count); // Update max if needed
            } else {
                count = 0;       // Reset count if we see a 0
            }
        }
        return max;
    }
}
