import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), nums, new boolean[nums.length]);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, List<Integer> current, int[] nums, boolean[] used) {
        if (current.size() == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                current.add(nums[i]);
                
                backtrack(ans, current, nums, used);
                
                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
    }
}
