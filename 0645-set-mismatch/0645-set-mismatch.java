import java.util.*;

class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int dup = -1;
        int n = nums.length;

        // find duplicate
        for (int num : nums) {
            if (set.contains(num)) dup = num;
            else set.add(num);
        }

        // find missing
        int missing = -1;
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }

        return new int[]{dup, missing};
    }
}
