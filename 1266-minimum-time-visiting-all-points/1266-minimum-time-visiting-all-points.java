class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int totalTime = 0;
        for (int i = 1; i < points.length; i++) {
            int[] current = points[i];
            int[] previous = points[i - 1];
            int X = Math.abs(current[0] - previous[0]);
            int Y = Math.abs(current[1] - previous[1]);
            totalTime += Math.max(X,Y);
        }
        
        return totalTime;
    }
}
