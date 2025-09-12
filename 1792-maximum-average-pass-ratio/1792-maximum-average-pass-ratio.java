class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));
        
        // Push [gain, pass, total] for each class
        for (int[] c : classes) {
            int pass = c[0], total = c[1];
            pq.add(new double[]{gain(pass, total), pass, total});
        }
        
        // Distribute extra students
        while (extraStudents-- > 0) {
            double[] top = pq.poll();
            int pass = (int) top[1];
            int total = (int) top[2];
            pass++;
            total++;
            pq.add(new double[]{gain(pass, total), pass, total});
        }
        
        // Calculate final average
        double sum = 0.0;
        while (!pq.isEmpty()) {
            double[] cur = pq.poll();
            sum += cur[1] / cur[2];
        }
        
        return sum / classes.length;
    }
    
    private double gain(int pass, int total) {
        return ((double)(pass + 1) / (total + 1)) - ((double) pass / total);
    }
}