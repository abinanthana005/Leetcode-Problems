class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++) {
            for (int edge : matrix[i]) {
                ans[i] += edge; 
            }
        }
        return ans;
    }
}
