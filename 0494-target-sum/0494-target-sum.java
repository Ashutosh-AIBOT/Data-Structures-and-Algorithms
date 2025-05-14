class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return countWays(nums, 0, 0, target);
    }

    private int countWays(int[] nums, int index, int currentSum, int target) {
        // Base case: if we have used all numbers
        if (index == nums.length) {
            // Check if we reached the target
            return currentSum == target ? 1 : 0;
        }

        // Add current number
        int add = countWays(nums, index + 1, currentSum + nums[index], target);

        // Subtract current number
        int subtract = countWays(nums, index + 1, currentSum - nums[index], target);

        // Total ways = ways with + and ways with -
        return add + subtract;
    }
}
