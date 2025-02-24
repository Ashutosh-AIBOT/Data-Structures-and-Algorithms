class Solution {
    public boolean isMonotonic(int[] nums) {
        int count = 0; 
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            if (nums[i - 1] >= nums[i]) {
                count++;
            }
        }
        
        if (count == len - 1) {
            return true;
        }

        count = 0;

        for (int i = 1; i < len; i++) {
            if (nums[i - 1] <= nums[i]) {
                count++;
            }
        }

        
        if (count == len - 1) {
            return true;
        }

        return false;
    }
}
