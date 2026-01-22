class Solution {
    public int smallestRangeI(int[] A, int K) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int a : A) {
            min = Math.min(min, a);
            max = Math.max(max, a);
        }

        return Math.max(0, max - min - 2 * K);
    }
}
