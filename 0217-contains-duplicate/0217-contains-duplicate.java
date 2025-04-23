class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> numSet = new HashSet<>();

        for( int num : nums){
            if( numSet.contains(num) ){
                return true ;
            }
            else{
                numSet.add(num);
            }

        }
        return false ;
    }
}