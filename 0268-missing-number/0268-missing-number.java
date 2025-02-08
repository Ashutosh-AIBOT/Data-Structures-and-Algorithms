class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int actualsum =  len * (len+1)/2 ;
        int oursum = 0 ;
        for(int num : nums){
            oursum += num ;
        }

        return actualsum - oursum ;
    }
}