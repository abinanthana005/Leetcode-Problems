class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++) {
            int num = nums.get(i);
            
            if (num == 2) {
                ans[i] = -1;
            } else {
                int mask = 1;
                while ((num & mask) > 0) {
                    mask <<= 1;
                }
                
                mask >>= 1;
                ans[i] = num - mask;
            }
        }
        
        return ans;
    }
}
