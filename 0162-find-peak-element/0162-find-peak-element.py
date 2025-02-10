class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        left, right = 0, len(nums) - 1

        while left < right:
            mid = left + (right - left) // 2

            if nums[mid] > nums[mid + 1]:  
                right = mid  # Peak is on the left side
            else:
                left = mid + 1  # Peak is on the right side
        
        return left  # The peak index