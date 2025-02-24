class Solution {
    public int thirdMax(int[] nums) {
    HashSet<Integer> uniqueNumbers = new HashSet<>();
      for(int num : nums ){
        uniqueNumbers.add(num);
      }
      Integer[] sortedNums = uniqueNumbers.toArray(new Integer[0]);
      Arrays.sort(sortedNums, Collections.reverseOrder());

      if (sortedNums.length >= 3) {
            return sortedNums[2]; // Third largest element
        }

        // Otherwise, return the maximum element
        return sortedNums[0];
    }

}