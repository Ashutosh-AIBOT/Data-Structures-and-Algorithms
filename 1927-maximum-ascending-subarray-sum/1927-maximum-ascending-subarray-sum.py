class Solution(object):
    def maxAscendingSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n=len(nums)
        maxVal=0

        curVal=nums[0]
        for i in range(1,n):
            if nums[i-1]<nums[i]:
                curVal+=nums[i]
            else:
                maxVal=max(maxVal, curVal)
                curVal=nums[i]
        
        return max(maxVal, curVal)