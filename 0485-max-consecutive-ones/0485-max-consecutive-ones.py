class Solution:
    def findMaxConsecutiveOnes(self, nums):
        max_count = 0  # Stores the maximum number of consecutive 1s
        count = 0  # Current count of consecutive 1s
        
        for num in nums:
            if num == 1:
                count += 1  # Increment count if we see a 1
                max_count = max(max_count, count)  # Update max_count if needed
            else:
                count = 0  # Reset count if we see a 0
        
        return max_count
