class Solution {
    public boolean isArmstrong(int n) {
        int original = n;
        
        // Step 1: count digits
        int digits = 0;
        while (n > 0) {
            digits++;
            n /= 10;
        }

        // Step 2: calculate sum
        n = original; // reset n back
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }

        // Step 3: compare
        return sum == original;
    }
}
