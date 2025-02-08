class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        length = len(nums)
        ActualSum = length * (length + 1 )/2 
        mySum = sum(nums)  # More Pythonic way to sum the list
        
        return  int(ActualSum - mySum)