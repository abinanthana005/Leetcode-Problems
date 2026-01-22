import java.util.*;

class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0, sumB = 0;
        for (int a : A) sumA += a;
        for (int b : B) sumB += b;

        int delta = (sumB - sumA) / 2;
        Set<Integer> setB = new HashSet<>();
        for (int b : B) setB.add(b);

        for (int a : A) {
            if (setB.contains(a + delta)) {
                return new int[]{a, a + delta};
            }
        }

        return new int[0]; // should not reach here
    }
}
