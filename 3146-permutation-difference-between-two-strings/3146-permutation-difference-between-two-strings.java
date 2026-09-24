class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] indices = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            indices[s.charAt(i) - 'a'] = i;
        }
        int totalDifference = 0;
        for (int i = 0; i < n; i++) {
            int posInS = indices[t.charAt(i) - 'a'];
            totalDifference += Math.abs(posInS - i);
        }
        return totalDifference;
    }
}
