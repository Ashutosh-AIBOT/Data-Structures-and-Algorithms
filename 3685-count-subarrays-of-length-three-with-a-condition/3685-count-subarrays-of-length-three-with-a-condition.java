class Solution {
     public int countSubarrays(int[] nums) {
        int count = 0;
        int n = nums.length;
        if (n < 3) {
            return 0;
        }
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] + nums[i + 2] == (double) nums[i + 1] / 2.0) {
                count++;
            }
        }
        return count;
    }
}
