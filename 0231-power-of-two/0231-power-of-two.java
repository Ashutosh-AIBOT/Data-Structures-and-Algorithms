class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false; // Power of two must be positive
        }
        
        while (n > 1) {
            if (n % 2 != 0) {
                return false; // If not divisible by 2, return false
            }
            n /= 2; // Divide by 2
        }
        
        return true; // If reduced to 1, it's a power of 2
    }
}
