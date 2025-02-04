class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0]; // Store maximum ascending sum
        int currentSum = nums[0]; // Store current ascending sum
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) { // If ascending order continues
                currentSum += nums[i];
            } else { // Reset sum if order breaks
                maxSum = Math.max(maxSum, currentSum);
                currentSum = nums[i]; // Start a new subarray
            }
        }
        
        // Compare one last time before returning
        return Math.max(maxSum, currentSum);
    }
}
