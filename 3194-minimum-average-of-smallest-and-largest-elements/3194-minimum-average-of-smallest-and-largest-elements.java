class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        
        int n = nums.length;
        double min = Double.MAX_VALUE;
        
        int i = 0;
        int j = n - 1;
        
        while (i < j) {
            double curr = (nums[i] + nums[j]) / 2.0;
            min= Math.min(min, curr);
            i++;
            j--;
        }
        
        return min;
    }
}
