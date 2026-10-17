class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        // move all non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        // fill remaining with zeros
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}