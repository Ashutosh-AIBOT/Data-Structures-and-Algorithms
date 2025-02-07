from typing import List

class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        k = k % len(nums)  # Handle cases where k > len(nums)
        
        def reverse(start, end):
            while start < end:
                nums[start], nums[end] = nums[end], nums[start]
                start += 1
                end -= 1
        
        # Step 1: Reverse the entire array
        reverse(0, len(nums) - 1)
        
        # Step 2: Reverse the first k elements
        reverse(0, k - 1)
        
        # Step 3: Reverse the remaining elements
        reverse(k, len(nums) - 1)
