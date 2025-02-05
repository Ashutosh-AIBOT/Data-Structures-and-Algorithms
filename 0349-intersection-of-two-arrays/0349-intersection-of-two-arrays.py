class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        
        set1 = set(nums1)  # Convert nums1 to a set for fast lookups
        set2 = set()        # Initialize an empty set to store the intersection

        # Loop through each element in nums2
        for num in nums2:   # Corrected variable name from 'num2' to 'nums2'
            if num in set1:  # Check if the element exists in set1
                set2.add(num)  # If yes, add it to the result set

        # Return the result as a list
        return list(set2)
