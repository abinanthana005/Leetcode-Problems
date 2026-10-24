class Solution {
    private int maxOr = 0;
    private int count = 0;

    public int countMaxOrSubsets(int[] nums) {
        maxOr = 0;
        count = 0;
        
        for (int num : nums) {
            maxOr |= num;
        }
        
        backtrack(nums, 0, 0);
        return count;
    }

    private void backtrack(int[] nums, int index, int currentOr) {
        if (currentOr == maxOr) {
            count += (1 << (nums.length - index));
            return;
        }
        if (index == nums.length) {
            return;
        }

        backtrack(nums, index + 1, currentOr | nums[index]);
        backtrack(nums, index + 1, currentOr);
    }
}
