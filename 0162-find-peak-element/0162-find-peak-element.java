class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if ((i == 0 || nums[i] > nums[i - 1]) && (i == len - 1 || nums[i] > nums[i + 1])) {
                return i; // Peak element found
            }
        }
        
        return -1; // Edge case (should never reach here)
    }
}
