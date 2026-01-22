class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int n = A.length;

        for (int i = 0; i < n; i++) {
            int left = 0, right = A[i].length - 1;

            while (left <= right) {
                // swap and invert in one step
                int temp = A[i][left] ^ 1;
                A[i][left] = A[i][right] ^ 1;
                A[i][right] = temp;

                left++;
                right--;
            }
        }

        return A;
    }
}
