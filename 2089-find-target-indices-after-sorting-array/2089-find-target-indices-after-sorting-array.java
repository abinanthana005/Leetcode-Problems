class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int countLessThanTarget = 0;
        int countEqualToTarget = 0;
        
        for (int num : nums) {
            if (num < target) {
                countLessThanTarget++;
            } else if (num == target) {
                countEqualToTarget++;
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < countEqualToTarget; i++) {
            ans.add(countLessThanTarget + i);
        }
        
        return ans;
    }
}