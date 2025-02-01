class Solution:
   from typing import List

class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        n = len(digits)
    
        # Start from the last digit and add 1
        for i in range(n - 1, -1, -1):
            if digits[i] < 9:
                digits[i] += 1  # No carry, just add 1
                return digits
            digits[i] = 0  # Carry over if the digit is 9
    
        # If we exit the loop, it means all digits were 9, so we need to add a leading 1
        return [1] + digits  # Prepend 1 to the list

# Create an object of the Solution class
sol = Solution()

# Test case 1
digits = [1, 2, 3]
print(sol.plusOne(digits)) 