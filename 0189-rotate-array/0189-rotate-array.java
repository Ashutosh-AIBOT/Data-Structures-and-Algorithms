class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        int[] temp = new int[len];

        for (int i = 0; i < len; i++) {
            temp[(i + k) % len] = nums[i]; // Shift elements by k positions
        }

        System.arraycopy(temp, 0, nums, 0, len); // Copy temp back to nums
    }
}
