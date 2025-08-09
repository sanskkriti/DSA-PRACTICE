class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers or numbers ending with 0 but not 0 itself are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            int digit = x % 10; //1 
            x = x / 10; //12
            reversed = reversed * 10 + digit; // 1
        }

        // For odd-length numbers, reversed/10 removes the middle digit
        return (x == reversed || x == reversed / 10);
    }
}
