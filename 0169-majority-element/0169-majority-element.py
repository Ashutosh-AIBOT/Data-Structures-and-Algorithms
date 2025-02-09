class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        length = int(len(nums)/2)
        nums.sort()
        return nums[length]
        
