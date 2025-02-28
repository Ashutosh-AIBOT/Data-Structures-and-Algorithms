class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
      int[] newArray = new int[len] ;
        n = len/2 ;
        int count = 0 ;
        for(int i = 0 ; i < n ; i++ ){
            newArray[count++] = nums[i];
            newArray[count++] = nums[i+n];
        }
        return newArray ;
    }
}