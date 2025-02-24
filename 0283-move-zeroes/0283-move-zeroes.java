class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;   
        int count = 0; // Tracks the position for non-zero elements

        // Move non-zero elements to the front
        for (int num : nums) {
            if (num != 0) {
                nums[count++] = num;
            }
        }

        // Fill the remaining positions with zeroes
        while (count < len) {
            nums[count++] = 0;
        }
    }

}

