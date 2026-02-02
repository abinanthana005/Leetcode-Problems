class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];

        for (int[] idx : indices) {
            rows[idx[0]] ^= 1;
            cols[idx[1]] ^= 1;
        }

        int oddRows = 0, oddCols = 0;
        for (int r : rows) if (r == 1) oddRows++;
        for (int c : cols) if (c == 1) oddCols++;

        return oddRows * (n - oddCols) + (m - oddRows) * oddCols;
    }
}
