class Solution:
    def myPow(self, x: float, n: int) -> float:
        if n == 0:
            return 1  # Base case: x^0 = 1
        
        if n < 0:
            x = 1 / x  # Convert negative exponent to positive
            n = -n

        result = 1
        while n > 0:
            if n % 2 == 1:  # If n is odd, multiply x with result
                result *= x
            x *= x  # Square x
            n //= 2  # Divide n by 2
        
        return result

