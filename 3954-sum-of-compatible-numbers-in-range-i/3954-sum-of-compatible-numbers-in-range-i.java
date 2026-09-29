class Solution {
    // The driver code expects exactly this method name and parameters
    public int sumOfGoodIntegers(int n, int k) {
        int ans = 0;
        
        // Define boundaries based on abs(n - x) <= k and x >= 1
        int start = Math.max(1, n - k);
        int end = n + k;
        
        // Check every number in the valid range
        for (int x = start; x <= end; x++) {
            // (n & x) == 0 satisfies the compatibility rule
            if ((n & x) == 0) {
                ans += x;
            }
        }
        
        return ans;
    }
}
