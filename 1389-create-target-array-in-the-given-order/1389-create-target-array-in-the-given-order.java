class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int idx = index[i];
            int val = nums[i];
            for (int j = i; j > idx; j--) {
                target[j] = target[j - 1];
            }
            target[idx] = val;
        }
        
        return target;
    }
}
