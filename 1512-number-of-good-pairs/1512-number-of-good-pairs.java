class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        int good = 0;
        
        for (int num : nums) {
            good += count[num];
            count[num]++;
        }
        
        return good;
    }
}
