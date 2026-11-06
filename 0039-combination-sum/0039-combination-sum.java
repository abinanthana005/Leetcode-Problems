import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(ans, new ArrayList<>(), candidates, target, 0);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, List<Integer> current, int[] candidates, int remain, int start) {
        if (remain == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > remain) {
                break;
            }

            current.add(candidates[i]);
            backtrack(ans, current, candidates, remain - candidates[i], i);
            current.remove(current.size() - 1);
        }
    }
}
