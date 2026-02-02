class Solution {
    public int numPrimeArrangements(int n) {
        int mod = 1_000_000_007;
        int primes = countPrimes(n);
        int nonPrimes = n - primes;

        long res = factorial(primes, mod) * factorial(nonPrimes, mod) % mod;
        return (int) res;
    }

    private int countPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        java.util.Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }

    private long factorial(int n, int mod) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res = (res * i) % mod;
        }
        return res;
    }
}
