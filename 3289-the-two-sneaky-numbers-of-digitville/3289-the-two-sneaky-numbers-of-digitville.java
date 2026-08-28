class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        boolean[] seen = new boolean[nums.length];
        int[] result = new int[2];
        int index = 0;

        for (int num : nums) {
            if (seen[num]) {
                result[index++] = num;
                if (index == 2) {
                    break;
                }
            } else {
                seen[num] = true;
            }
        }

        return result;
    }
}
