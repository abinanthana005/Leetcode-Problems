class Solution {
    public int countKDifference(int[] nums, int k) {
        int[] count = new int[101];
        int ans = 0;
        for (int num : nums) {
            if (num - k >= 1) {
                ans += count[num - k];
            }
            if (num + k <= 100) {
                ans += count[num + k];
            }
            count[num]++;
        }
        return ans;
    }
}
