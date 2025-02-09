class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length/2 ;
        Arrays.sort(nums);
        return nums[len];
    }
}