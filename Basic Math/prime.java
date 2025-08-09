public class Prime {  //O root n complexity (slow but v efficient)
    public boolean isPrime(int n) {
        if (n <= 1) return false;       // 0, 1, and negatives are not prime
        if (n == 2) return true;        // 2 is prime
        if (n % 2 == 0) return false;   // eliminate even numbers

        for (int i = 3; i * i <= n; i += 2) { // check only odd divisors
            if (n % i == 0) return false;
        }
        return true;
    }
}
