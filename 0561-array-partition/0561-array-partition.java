class Solution {
    public int arrayPairSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int sum = 0 ; 
        for(int i = 0 ; i < len ; i +=2 ){
            if(nums[i] <= nums[i+1] ){
               sum += nums[i];
            }
        }

        return sum ;
    }
}