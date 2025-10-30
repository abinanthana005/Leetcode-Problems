class Solution {
    public int primePalindrome(int N) {
        if (N <= 2) return 2;
        if (N <= 3) return 3;
        if (N <= 5) return 5;
        if (N <= 7) return 7;
        if (N <= 11) return 11;

        for (int length = 1; length < 100000; length++) {
            String s = String.valueOf(length);
            String rs = new StringBuilder(s.substring(0, s.length() - 1)).reverse().toString();
            int palindrome = Integer.parseInt(s + rs);

            if (palindrome >= N && isPrime(palindrome))
                return palindrome;
        }
        return -1;
    }

    private boolean isPrime(int x) {
        if (x < 2) return false;
        if (x % 2 == 0) return x == 2;
        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }
}