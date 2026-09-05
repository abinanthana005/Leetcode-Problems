class Solution {
    public int[] transformArray(int[] nums) {
        int even= 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                even++;
            }
        }
        for (int i = 0; i < even; i++) {
            nums[i] = 0;
        }
        for (int i = even; i < nums.length; i++) {
            nums[i] = 1;
        }
        return nums;
    }
}