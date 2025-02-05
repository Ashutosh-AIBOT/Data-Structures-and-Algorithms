class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();  // Corrected to 'Set<Integer> set2'

        // Adding elements from nums1 to set1
        for (int n : nums1) {
            set1.add(n);
        }

        // Check for common elements in nums2 and add them to set2
        for (int m : nums2) {
            if (set1.contains(m)) {
                set2.add(m);  // Adding the common element to set2
            }
        }

        // Convert set2 to an array
        int[] result = new int[set2.size()];
        int index = 0;
        for (int num : set2) {
            result[index++] = num;
        }

        return result;
    }
}